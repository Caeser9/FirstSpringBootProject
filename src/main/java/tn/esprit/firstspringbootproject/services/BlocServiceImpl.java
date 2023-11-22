package tn.esprit.firstspringbootproject.services;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.entities.ChamberType;
import tn.esprit.firstspringbootproject.entities.Chambre;
import tn.esprit.firstspringbootproject.repository.IBlocRepository;
import tn.esprit.firstspringbootproject.repository.IChambreRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@ToString
@Service
public class BlocServiceImpl implements IBloc{
    @Autowired
    IBlocRepository iBlocRepository ;


    //@Scheduled(cron="* 1 * * * *")
    //@Scheduled(fixedRate = 60000)
    @Override
    public List<Bloc> retrieveAllBlocs() {
        return iBlocRepository.findAll();
       // List<Bloc> blocList=iBlocRepository.findAll();
        /*for (Bloc b : blocList){
            log.info("Bloc: "+b +"TEST");
        }
        return blocList;*/
    }

    @Override
    public Bloc retrieveBloc(Long blocId) {
        return iBlocRepository.findById(blocId).get();
    }

    @Override
    public Bloc addBloc(Bloc c) {
        return iBlocRepository.save(c);
    }

    @Override
    public void removeBloc(Long blocId) {
        iBlocRepository.deleteById(blocId);
    }

    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return iBlocRepository.save(bloc);
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, ChamberType typeC) {
        Bloc b = iBlocRepository.findById(idBloc).get();
        List<Chambre> chambres = new ArrayList<>();
        int j = 0;
        for (int i=0 ; i< b.getChambers().size();i++){
            if(b.getChambers().get(i).getTypeC()==typeC)
             chambres.add(b.getChambers().get(i));
        }
    return chambres ;
    }


}
