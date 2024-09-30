package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class PermissionId implements Serializable {
    private long noteId;
    private long userId;

    public PermissionId() {
    }
    public PermissionId(long noteId, long userId) {
        this.noteId = noteId;
        this.userId = userId;
    }
}
