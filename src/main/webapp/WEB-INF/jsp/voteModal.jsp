<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Modal -->
<div class="modal fade" id="voteModal" tabindex="-1" role="dialog" aria-labelledby="voteModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Beverage of the Week</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
                <div class="modal-body">
                    <form id="voteForm" method="post">
                        <c:forEach var="bevr" items="${voteOption}">
                            <div class="form-check">
                                <label class="form-check-label">
                                    <input class="form-check-input" type="radio" name="voteItems"
                                           id="${bevr.getItemId()}" value="${bevr.getItemId()}">
                                    ${bevr.getItemName()}
                                </label>
                            </div>
                        </c:forEach>
                    </form>
                    <h3>Results</h3>
                    <c:forEach var="entry" items="${voteResults}">
                        Beverage: <c:out value="${entry.key.getItemName()}"/>
                        - <c:out value="${entry.value}"/><br>
                    </c:forEach>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" form="voteForm" formaction="/vote" class="btn btn-primary">Vote</button>
                </div>
        </div>
    </div>
</div>