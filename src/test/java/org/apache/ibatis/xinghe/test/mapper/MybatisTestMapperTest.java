package org.apache.ibatis.xinghe.test.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.xinghe.entity.MybatisTest;
import org.apache.ibatis.xinghe.mapper.MybatisTestMapper;
import org.junit.Assert;
import org.junit.Test;

public class MybatisTestMapperTest {

    private MybatisTestMapper mybatisTestMapper;

    @Test
    public void getById() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        mybatisTestMapper = sqlSession.getMapper(MybatisTestMapper.class);
        MybatisTest opt = mybatisTestMapper.getById(1L);
        Assert.assertTrue(Objects.isNull(opt));
    }
}