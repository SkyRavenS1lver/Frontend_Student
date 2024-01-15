package skyravens1lver.frontend.network;

import netscape.javascript.JSObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import skyravens1lver.frontend.dto.StudentDto;
import skyravens1lver.frontend.entity.ResponseFromApi;
import skyravens1lver.frontend.model.StudentInsert;
import skyravens1lver.frontend.model.StudentUpdate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class API {
    static String uri = "http://localhost:8081/";
    static RestTemplate restTemplate = new RestTemplate();

    public static List<StudentDto> getAllData(){
        ResponseFromApi<List<StudentDto>> responseFromApi = restTemplate.getForObject(uri, ResponseFromApi.class);
        if (responseFromApi.getData() != null) {
            return responseFromApi.getData();
        }
        else {
            return new ArrayList<>();
        }
    }
    public static String insertStudent(StudentInsert studentInsert){
        ResponseEntity<ResponseFromApi> response = restTemplate.exchange(
                uri,
                HttpMethod.POST,
                new HttpEntity<>(studentInsert),
                ResponseFromApi.class
        );
        return Objects.requireNonNull(response.getBody()).getMessage();
    }
    public static String updateStudent(StudentUpdate studentInsert){
        ResponseEntity<ResponseFromApi> response = restTemplate.exchange(
                uri,
                HttpMethod.PUT,
                new HttpEntity<>(studentInsert),
                ResponseFromApi.class
        );
        return Objects.requireNonNull(response.getBody()).getMessage();
    }
    public static void deleteStudent(String id){
        URI uriLink = URI.create(uri+id);
        restTemplate.delete(uriLink);
    }
}
