package dec.eyad.house_selection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dec.eyad.house_selection.model.Consult;
import dec.eyad.house_selection.repository.ConsultRepository;

import java.util.Optional;



@Service
public class ConsultService {

    @Autowired
    private ConsultRepository consultRepository;

    public List<Consult> getAllConsults() {
        return consultRepository.findAll();
    }

    public Consult getConsultById(Long idConsult) {
        return consultRepository.findById(idConsult).orElse(null);
    }

    public Consult createConsult(Consult consult) {
        return consultRepository.save(consult);
    }

    public Consult updateConsult(Consult consult) {
        return consultRepository.save(consult);
    }

    public void deleteConsultById(Long idConsult) { 
        consultRepository.deleteById(idConsult);
    }
}