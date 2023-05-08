# Exception_Handling
## Spring RestTemplate Error Handling
in this cover the Exception handling.

```
@PostMapping("/generate")
	public ResponseEntity<?> generateShortLink(@RequestBody Url userUrl) {
		try {
			Url user1 = urlService.generateShortLink(userUrl);
			return ResponseEntity.status(HttpStatus.CREATED).body(user1);
		} catch (HttpClientErrorException ex) {

			return ResponseEntity.status(ex.getStatusCode()).build();
		} catch (HttpServerErrorException ex) {

			return ResponseEntity.status(ex.getStatusCode()).build();
		} catch (Exception ex) {

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
```

** HttpClientErrorException ex **
Exception thrown when an HTTP 4xx(400 - 499) is received.
These errors occur when the client (i.e., the user agent making the request) sends a request that the server cannot fulfill or process.
400 Bad Request: The server cannot understand the request due to invalid syntax.
401 Unauthorized: The client must authenticate itself to get the requested response.
403 Forbidden: The server understands the request but refuses to authorize it.
404 Not Found: The server cannot find the requested resource.
405 Method Not Allowed: The method specified in the request is not allowed for the resource.
408 Request Timeout: The client did not produce a request within the time that the server was prepared to wait.
409 Conflict: The request could not be completed due to a conflict with the current state of the resource.
429 Too Many Requests: The user has sent too many requests in a given amount of time.

** HttpServerErrorException ex **
Exception thrown when an HTTP 5xx(500 - 599) is received.
These errors occur when the server is unable to fulfill a valid request due to an unexpected condition.
500 Internal Server Error: The server encountered an unexpected condition that prevented it from fulfilling the request.
501 Not Implemented: The server does not support the functionality required to fulfill the request.
502 Bad Gateway: The server, while acting as a gateway or proxy, received an invalid response from the upstream server it accessed in attempting to fulfill the request.
503 Service Unavailable: The server is currently unable to handle the request due to a temporary overload or maintenance of the server.
504 Gateway Timeout: The server, while acting as a gateway or proxy, did not receive a timely response from the upstream server it accessed in attempting to fulfill the request.
505 HTTP Version Not Supported: The server does not support the HTTP protocol version used in the request.


<!-- Heling hand Link --> 
<!-- https://www.baeldung.com/spring-rest-template-error-handling -->
