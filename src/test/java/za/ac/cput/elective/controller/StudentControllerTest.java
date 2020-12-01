//package za.ac.cput.elective.controller;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//import za.ac.cput.elective.entity.Student;
//import za.ac.cput.elective.factory.StudentFactory;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@RunWith(SpringRunner.class)
//public class StudentControllerTest {
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//    private static final String baseURL = "http://localhost:8080/student/";
//    private static Student s = StudentFactory.createStudent(2, "AppDev");
//
//    private static String username_admin_security = "admin";
//    private static String password_admin_security = "psw";
//
//    private static String username_lecturer_security = "lecturer";
//    private static String password_lecturer_security = "password2";
//
//    private static String username_student_security = "student";
//    private static String password_student_security = "password";
//
//    @Test
//    public void create() {
//
//        String url = baseURL + "create";
//        /*only admin can create Students*/ ResponseEntity<Student> r = restTemplate.withBasicAuth(username_admin_security, username_admin_security).postForEntity(url, s, Student.class);
//        assertNotNull(r);
//        assertNotNull(r.getBody());
//
//        System.out.println(r.getBody());
//
//    }
//
//    @Test
//    public void read() {
//        String url = baseURL + "read/" + s.getStudentID();
//        /*everyone can read Student*/ ResponseEntity<Student> r = restTemplate.withBasicAuth(username_student_security, password_student_security).withBasicAuth(username_lecturer_security, password_lecturer_security).withBasicAuth(username_admin_security, username_admin_security).getForEntity(url, Student.class);
//        assertEquals(s.getStudentID(), r.getBody().getStudentID());
//    }
//
//    @Test
//    public void update() {
//        Student u = new Student.Builder().copy(s).setStudentID("230").build();
//        String url = baseURL + "update";
//        /*only admin and lecturer can Update students*/ResponseEntity<Student> r = restTemplate.withBasicAuth(username_lecturer_security, password_lecturer_security).withBasicAuth(username_admin_security, username_admin_security).postForEntity(url, u, Student.class);
//        assertEquals(s.getStudentID(), r.getBody().getStudentID());
//    }
//
//    @Test
//    public void delete() {
//        String url = baseURL + "delete/" + s.getStudentID();
//        /*only admin and lecturer can Delete students*/restTemplate.withBasicAuth(username_lecturer_security, password_lecturer_security).withBasicAuth(username_admin_security, username_admin_security).delete(url);
//    }
//
//    @Test
//    public void getAll() {
//        String url = baseURL + "all";
//        HttpHeaders h = new HttpHeaders();
//        HttpEntity<String> entity = new HttpEntity<>(null, h);
//        /*only admin and lecturer can getAll students*/ResponseEntity<String> r = restTemplate.withBasicAuth(username_lecturer_security, password_lecturer_security).withBasicAuth(username_admin_security, username_admin_security).exchange(url, HttpMethod.GET, entity, String.class);
//
//        System.out.println(r);
//        System.out.println(r.getBody());
//    }
//}