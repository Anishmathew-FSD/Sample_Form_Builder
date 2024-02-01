package com.formbuilder.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lookuptable")
public class LookupTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "table_id")
    private int tableId;

    @Column(name = "table_name")
    private  String tableName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lookupTable", cascade = CascadeType.ALL)
    private List<LookupRow> lookupRows;
}
