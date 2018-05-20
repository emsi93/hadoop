<%@include file="../includes/top.jsp" %>

                <form action="/login" method="post">
                        Login:
                        <input id="login" name="login" type="text" class="form-control">
                        Password:
                        <input id="password" name="password" type="password" class="form-control">

                    <input type="hidden" name="${_csrf.parameterName}"
                           value="${_csrf.token}"/>
                    <button type="submit">Zaloguj</button>

                </form>
<%@include file="../includes/bottom.jsp" %>