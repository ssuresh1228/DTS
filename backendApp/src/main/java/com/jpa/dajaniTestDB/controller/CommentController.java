package com.jpa.dajaniTestDB.controller;

import com.jpa.dajaniTestDB.model.CommentModel;
import com.jpa.dajaniTestDB.service.serviceInterface.CommentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @Operation(summary = "Returns all comments")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Got all comments from a ticket"),
            //content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "Not available",
                    content = @Content)
    })
    @GetMapping("/comments")
    public List <CommentModel> getComments(){
        return commentService.getAllComments();
    }

    @Operation(summary = "Adds a commentEntity to a ticketEntity")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Saved commentEntity on a ticketEntity"),
            //content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "Not available",
                    content = @Content)
    })
    @PostMapping("/comments/{ticketId}/{userId}")
    public CommentModel createComment(@RequestBody CommentModel commentModel, @PathVariable Integer ticketId,
                                      @PathVariable Integer userId){

        return commentService.createComment(commentModel, ticketId, userId);
    }
}
