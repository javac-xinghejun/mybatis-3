package org.apache.ibatis.xinghe.mapper;

import java.util.Optional;
import org.apache.ibatis.xinghe.entity.MybatisTest;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2022/1/17 - 3:10 下午
 * @see [相关类/方法]
 * @since [版本号]
 */
public interface MybatisTestMapper {

    /**
     * 通过id
     *
     * @param id id
     * @return {@link Optional}<{@link MybatisTest}>
     */
    MybatisTest getById(Long id);


}
