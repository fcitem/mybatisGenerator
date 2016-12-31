package service.Impl;

import bean.Section;
import bean.SectionExample;
import bean.SectionKey;
import dao.SectionMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.SectionService;

@Service
public class SectionServiceImpl implements SectionService {
    @Autowired
    String mapper;

    @Override
    public long countByExample(SectionExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SectionExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(SectionKey key) {
        return mapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(Section record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Section record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Section> selectByExampleWithBLOBs(SectionExample example) {
        return mapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<Section> selectByExample(SectionExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Section selectByPrimaryKey(SectionKey key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(@Param("record") Section record, @Param("example") SectionExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExampleWithBLOBs(@Param("record") Section record, @Param("example") SectionExample example) {
        return mapper.updateByExampleWithBLOBs(record,example);
    }

    @Override
    public int updateByExample(@Param("record") Section record, @Param("example") SectionExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Section record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Section record) {
        return mapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(Section record) {
        return mapper.updateByPrimaryKey(record);
    }
}