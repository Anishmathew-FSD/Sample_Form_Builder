package com.formbuilder.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lookuprow")
public class LookupRow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowId;

    private int sortingOrder;

    private String value;

    private String label;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="table_id", nullable=false)
    private LookupTable lookupTable;
}
