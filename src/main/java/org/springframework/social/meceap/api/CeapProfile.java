package org.springframework.social.meceap.api;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
public class CeapProfile {
// ------------------------------ FIELDS ------------------------------

    private Long id;
    private String name;
    private String email;

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}