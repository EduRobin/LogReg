package cz.educanet.logreg;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class LoginManager implements Serializable {
    User loggedUser = null;
}
