package com.jrp.gsb.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.jrp.gsb.entities.Editor;

public interface EditorRepository extends CrudRepository <Editor,Long> {
    @Override
    public List<Editor>  findAll();
    
}
