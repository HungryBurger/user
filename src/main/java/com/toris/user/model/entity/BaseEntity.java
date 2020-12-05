package com.toris.user.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.toris.user.common.Utils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@MappedSuperclass
@NoArgsConstructor
public abstract class BaseEntity {
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "create_user_id", updatable = false)
    private Long createUserId;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "update_user_id")
    private Long updateUserId;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @PrePersist
    public void prePersist() {
        this.deletedAt = null;
        this.createdAt = this.createdAt == null ? LocalDateTime.now() : this.createdAt;
        this.updatedAt = LocalDateTime.now();
        this.createUserId = this.createUserId == null ? Utils.getUserId() == null ? null : Utils.getUserId() : this.createUserId;
        if (Utils.getUserId() == null)
            this.updateUserId = Utils.getUserId();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
        if (Utils.getUserId() == null)
            this.updateUserId = Utils.getUserId();
    }

    public void deleteData() {
        this.deletedAt = LocalDateTime.now();
    }

    public void updateData() {
        this.updatedAt = LocalDateTime.now();
        this.updateUserId = Utils.getUserId();
    }
}
