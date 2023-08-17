<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp" %>
<div id="sub">
    <div><img src="../images/sub_top_tit3.png" alt="CROP TALK"></div>
    <section class="croptalk">
        <aside>
            <img src="../images/sub_aside_cate3_tit.png" alt="농작물이야기"/>

            <ul class="lnb">
                <li class="on"><a href="./story.jsp">농작물이야기</a></li>
                <li><a href="./grow.jsp">텃밭가꾸기</a></li>
                <li><a href="./school.jsp">귀농학교</a></li>
            </ul>

        </aside>
        <article>
            <nav>
                <img src="../images/sub_nav_tit_cate3_tit1.png" alt="농작물이야기"/>
                <p>
                    HOME > 농작물이야기 > <em>농작물이야기</em>
                </p>
            </nav>

            <!-- 내용 시작 -->
		<section id="board" class="list">
          <h3>List</h3>
          <article>
              <table class="writertable">
                  <tr>
                      <th>Number</th>
                      <th>Title</th>
                      <th>Writer</th>
                      <th>Date</th>
                      <th>inquiry</th>
                  </tr>
                  <tr>
                      <td>1</td>
                      <td><a href="#">1</a>&nbsp;[1]</td>
                      <td>2</td>
                      <td>3</td>
                      <td>4</td>
                  </tr>
              </table>
          </article>
          <div class="paging">
              <a href="#" class="prev">Back</a>
              <a href="#" class="num">1</a>
              <a href="#" class="next">Next</a>
          </div>

          <a href="/Jboard/write.jsp" class="btnWrite">Write</a>
      </section>
            <!-- 내용 끝 -->

        </article>
    </section>
</div>
<%@ include file="../_footer.jsp" %>