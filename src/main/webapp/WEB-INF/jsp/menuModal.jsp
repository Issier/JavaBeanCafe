<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Modal -->
<div class="modal fade" id="menuModal" tabindex="-1" role="dialog" aria-labelledby="menuModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Menu</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <table class="table">
                    <thead>
                    <tr>
                        <th scope="col">Item Name</th>
                        <th scope="col">Item Cost</th>
                        <th scope="col">Health Facts</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${menu}" var="menuItem">
                        <tr>
                            <th scope="row"><c:out value="${menuItem.getItemName()}" /></th>
                            <td><c:out value="${menuItem.getItemCost()}"/> </td>
                            <td><c:out value="${menuItem.getHealthFacts()}"/></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>