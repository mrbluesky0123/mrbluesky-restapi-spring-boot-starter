package me.mrbluesky.controller;

import java.util.List;
import me.mrbluesky.dao.MemberRepository;
import me.mrbluesky.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MrBlueskyController {

  @Autowired
  private MemberRepository memberRepository;

  @GetMapping(path="/list")
  public List<Member> list(Member model) {

    List<Member> helloList = memberRepository.findAll();

    return helloList;
  }


}
