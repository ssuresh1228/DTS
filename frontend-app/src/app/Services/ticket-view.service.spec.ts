import { HttpClientModule } from '@angular/common/http';
import { TestBed } from '@angular/core/testing';
import { TicketViewService } from './ticket-view.service';

describe('TicketViewService', () => {
  let service: TicketViewService;

  beforeEach(() => {
    TestBed.configureTestingModule({
		imports: [HttpClientModule]
	});
    service = TestBed.inject(TicketViewService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});