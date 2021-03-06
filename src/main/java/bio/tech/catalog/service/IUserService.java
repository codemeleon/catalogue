package bio.tech.catalog.service;

import bio.tech.catalog.persistence.model.User;
import bio.tech.catalog.persistence.model.VerificationToken;
import bio.tech.catalog.web.dto.UserDto;
import bio.tech.catalog.web.error.UserAlreadyExistException;

import java.util.Collection;
import java.util.List;

public interface IUserService {

    User registerNewUserAccount(UserDto accountDto) throws UserAlreadyExistException;

    User getUser(String verificationToken);

    void saveRegisteredUser(User user);

    void deleteUser(Collection<User> user);

    void createVerificationTokenForUser(Collection<User> user, String token);

    VerificationToken getVerificationToken(String verificationToken);

    User findUserByEmail(String email);

    User findUserByUsername(String username);

    User getUserByID(long id);

    void changeUserPassword(User user, String password);

    boolean checkIfValidOldPassword(User user, String password);

    List<String> getUsersFromSessionRegistry();

    String validateVerificationToken(String token);

    void createPasswordResetTokenForUser(Collection<User> user, String token);

    Collection<User> findUsersByRole(String role);

    User findUserByCartId(Long id);

    Collection<User> findAllUsers();
}
