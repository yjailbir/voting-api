package program.code.voting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import program.code.voting.dto.VoteDto;
import program.code.voting.entity.Vote;
import program.code.voting.repository.VotesRepository;

import java.util.Arrays;
import java.util.HashMap;

@RestController
public class VotingController {
    private final VotesRepository votesRepository;

    @Autowired
    public VotingController(VotesRepository repository){
        this.votesRepository = repository;
    }

    @PostMapping("/vote")
    public ResponseEntity<HashMap<String, String>> vote(@RequestBody VoteDto dto){
        Vote vote = new Vote();

        vote.setSpeaker(dto.getSpeaker());
        vote.setMark(dto.getRating());

        if(dto.getAddInfo() != null){
            for (String s: dto.getAddInfo()){
                switch (s){
                    case "Огонь" -> vote.setFire(true);
                    case "Без воды" -> vote.setWithoutWater(true);
                    case "Свежо" -> vote.setFresh(true);
                    case "Глубоко" -> vote.setDeep(true);
                }
            }
        }

        votesRepository.save(vote);

        HashMap<String, String> response = new HashMap<>();

        response.put("status", "done");

        return ResponseEntity.ok(response);
    }

    @GetMapping("/test")
    public void test(){
        System.out.println(Arrays.toString(votesRepository.findAll().toArray()));
    }

    @DeleteMapping("/truncate")
    public void truncate(){
        votesRepository.deleteAll();
    }
}
