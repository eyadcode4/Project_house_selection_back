package dec.eyad.house_selection.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dec.eyad.house_selection.model.Consult;

@RestController
@RequestMapping("/api/v1/consult")
public class ConsultController {

    @PostMapping("/categorize")
    public ResponseEntity<String> categorizeAge(@RequestBody Consult consult) {
        String category = "";

        if (consult.getAge() < 30) {
            category = "Menos de 30";
        } else if (consult.getAge() >= 30 && consult.getAge() <= 40) {
            category = "Entre 30 y 40";
        } else {
            category = "Más de 40";
        }

        return ResponseEntity.ok("Categoría de edad: " + category);
    }
}


// package dec.eyad.house_selection.controller;


// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import java.util.List;
// import dec.eyad.house_selection.model.Consult;

// import dec.eyad.house_selection.service.ConsultService;
// @RestController
// @RequestMapping("api/v1/consult")
// @CrossOrigin(origins = "http://localhost:5173", allowedHeaders = "*")
// public class ConsultController {
    
//     private final ConsultService consultService;
//       @Autowired
//     private ConsultController(ConsultService consultService){
//         this.consultService= consultService;
//     }
    

//    @GetMapping("/all")
//     public ResponseEntity<List<Consult>> getAllConsults() {
//         List<Consult> consults = consultService.getAllConsults();
//         return ResponseEntity.ok(consults);
//     }

//     @GetMapping("/{idConsult}")
//     public ResponseEntity<Consult> getConsultById(@PathVariable Long idConsult) {
//         Consult consult = consultService.getConsultById(idConsult);
//         if (consult != null) {
//             return ResponseEntity.ok(consult);
//         } else {
//             return ResponseEntity.notFound().build();
//         }
//     }

//    @PostMapping
//     public ResponseEntity<Consult> createConsult(@RequestBody Consult consult) {
//         Consult createdConsult = consultService.createConsult(consult);
//         return ResponseEntity.status(HttpStatus.CREATED).body(createdConsult);
//     }

//   @PutMapping("/{idConsult}")
//     public ResponseEntity<Consult> updateConsult(@RequestBody Consult consult, @PathVariable Long idConsult) {
//         consult.setIdConsult(idConsult);
//         Consult updatedConsult = consultService.updateConsult(consult);
//         return ResponseEntity.ok(updatedConsult);
//     }

//     @DeleteMapping("/{idConsult}")
//     public ResponseEntity<Void> deleteConsultById(@PathVariable Long idConsult) {
//        consultService.deleteConsultById(idConsult);

//         return ResponseEntity.noContent().build();
//     }
// }