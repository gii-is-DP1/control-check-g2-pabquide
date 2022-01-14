package org.springframework.samples.petclinic.feeding;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedingService {

    @Autowired
    private FeedingRepository feedingRepository;

    public List<Feeding> getAll(){
        List<Feeding> p= feedingRepository.findAll();
        return p;
    }

    public List<FeedingType> getAllFeedingTypes(){
        return null;
    }

    public FeedingType getFeedingType(String typeName) {
        FeedingType p= feedingRepository.findFeedingType(typeName);
        return p;
    }

    public Feeding save(Feeding p) throws UnfeasibleFeedingException {
        return null;           
    }

    
}
