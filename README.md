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
```\

** HttpClientErrorException ex **
Exception thrown when an HTTP 4xx(400 - 499) is received.

** HttpServerErrorException ex **
Exception thrown when an HTTP 5xx(500 - 599) is received.




<!-- https://www.baeldung.com/spring-rest-template-error-handling -->
