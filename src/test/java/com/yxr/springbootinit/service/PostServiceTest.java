package com.yxr.springbootinit.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yxr.springbootinit.model.dto.post.PostQueryRequest;
import com.yxr.springbootinit.model.entity.Post;
import javax.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 帖子服务测试
 *
 * @author <a href="https://github.com/liehuo0423">程序员烈火</a>
 * @from <a href="https://liehuocoder.online">程序员烈火</a>
 */
@SpringBootTest
class PostServiceTest {

    @Resource
    private PostService postService;

    @Test
    void searchFromEs() {
        PostQueryRequest postQueryRequest = new PostQueryRequest();
        postQueryRequest.setUserId(1L);
        Page<Post> postPage = postService.searchFromEs(postQueryRequest);
        Assertions.assertNotNull(postPage);
    }

}