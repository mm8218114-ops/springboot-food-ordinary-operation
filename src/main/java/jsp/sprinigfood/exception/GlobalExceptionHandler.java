package jsp.sprinigfood.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jsp.sprinigfood.dto.ResponseStructure;


public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> handlerIdNotFoundExceptionEntity(IdNotFoundException exception) {
		
		ResponseStructure<String> res = new ResponseStructure<String>();
		
		res.setStatusCode(HttpStatus.NOT_FOUND.value());
		res.setMessage(exception.getMessage());
		res.setData("Failure");
		
		return new ResponseEntity<ResponseStructure<String>> (res,HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(NoRecordsAvailableException.class)
	public ResponseEntity<ResponseStructure<String>> handlerNoRecordAvailableException(NoRecordsAvailableException exception) {
		
		ResponseStructure<String> res = new ResponseStructure<String>();
		
		res.setStatusCode(HttpStatus.NOT_FOUND.value());
		res.setMessage(exception.getMessage());
		res.setData("Failure");
		
		return new ResponseEntity<ResponseStructure<String>>(res,HttpStatus.NOT_FOUND);
		
	}

}
