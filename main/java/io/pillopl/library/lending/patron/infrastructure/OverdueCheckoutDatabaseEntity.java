package io.pillopl.library.lending.patron.infrastructure;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@NoArgsConstructor
@EqualsAndHashCode
@Getter
class OverdueCheckoutDatabaseEntity {

    @Id
    Long id;
    UUID patronId;
    UUID bookId;
    UUID libraryBranchId;

    String userName;

    OverdueCheckoutDatabaseEntity(UUID bookId, UUID patronId, UUID libraryBranchId) {
        this.bookId = bookId;
        this.patronId = patronId;
        this.libraryBranchId = libraryBranchId;
    }

    boolean is(UUID patronId, UUID bookId, UUID libraryBranchId) {
        return  this.patronId.equals(patronId) &&
                this.bookId.equals(bookId) &&
                this.libraryBranchId.equals(libraryBranchId);
    }
}
