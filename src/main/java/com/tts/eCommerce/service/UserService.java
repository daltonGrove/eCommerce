package com.tts.eCommerce.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

  private UserRepository userRepository;
  private RoleRepository roleRepository;
  private BCryptPasswordEncoder bCryptPasswordEncoder;

  @Autowired
  public UserService(UserRepository userRepository,
      RoleRepository roleRepository,
      BCryptPasswordEncoder bCryptPasswordEncoder) {
    this.userRepository = userRepository;
    this.roleRepository = roleRepository;
    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
  }

  public User findByUsername(String username) {
    return userRepository.findByUsername(username);
  }

  public List<User> findAll() {
    return (List<User>) userRepository.findAll();
  }

  public void save(User user) {
    userRepository.save(user);
  }

  public User saveNewUser(User user) {
    user.setPassword(
        bCryptPasswordEncoder.encode(user.getPassword()));
    Role userRole = roleRepository.findByRole("USER");
    user.setRoles(
        new HashSet<Role>(Arrays.asList(userRole)));
    return userRepository.save(user);
  }

  public User getLoggedInUser() {
    String loggedInUsername = SecurityContextHolder
        .getContext().getAuthentication().getName();
    return findByUsername(loggedInUsername);
  }

}

