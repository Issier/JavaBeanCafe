<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Modal -->
<div class="modal fade" id="registerModal" tabindex="-1" role="dialog" aria-labelledby="contactModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel" align="center">Register</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form id="registerForm" method="post">
                <div class="modal-body">
                        <div class="form-group">
                            <label for="username">Username</label>
                            <input type="text" class="form-control" id="username" name="username" placeholder="ex. bob123">
                        </div>
                        <div class="form-group">
                            <label for="passwd">Password</label>
                            <input type="password" class="form-control" id="passwd" name="passwd" placeholder="Minimum 6 characters">
                        </div>
                        <div class="form-group">
                            <label for="renterpass">Re-Enter Password</label>
                            <input type="password" class="form-control" id="renterpass" name="renterpass" placeholder="Minimum 6 characters">
                        </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" form="registerForm" formaction="/register" class="btn btn-primary">Register</button>
                </div>
            </form>
        </div>
    </div>
</div>