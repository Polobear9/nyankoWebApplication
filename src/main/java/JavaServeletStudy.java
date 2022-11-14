import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JavaServeletStudy {
    @WebServlet("/ProductConfirmationServlet")
    public class ProductConfirmationServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;

        /**
         * @see HttpServlet#HttpServlet()
         */
        public ProductConfirmationServlet() {
            super();
            // TODO Auto-generated constructor stub
        }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // TODO Auto-generated method stub
            response.getWriter().append("Served at: ").append(request.getContextPath());
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            ProductForm form = getForm(request);
            request.setAttribute("productForm", form);
            request.setCharacterEncoding("UTF-8");
            String productid = request.getParameter("productId");
            System.out.println("id : " + productid);
            RequestDispatcher result = request.getRequestDispatcher("/productConfirmation.jsp");
            result.forward(request, response);
        }

        private ProductForm getForm(HttpServletRequest request) {
            String id = request.getParameter("productId");
            String name = request.getParameter("productName");
            String detail = request.getParameter("productIntroduction");
            String category = request.getParameter("productClasses");
            String salesPrice = request.getParameter("productSellPrice");
            String purchesePrice = request.getParameter("productOrderPrice");
            String[] salesStoreIds = request.getParameterValues("sellersShopName");
            String registrationYear = request.getParameter("addedYear");
            String registrationMonth = request.getParameter("addedMonth");
            String registrationDay = request.getParameter("addedDay");

            ProductForm form = new ProductForm();
            form.setProductId(id);
            form.setProductName(name);
            form.setProductIntroduction(detail);
            form.setProductClasses(category);
            form.setProductSellPrice(salesPrice);
            form.setProductOrderPrice(purchesePrice);
            form.setSellersShopName(salesStoreIds);
            form.setAddedYear(registrationYear);
            form.setAddedMonth(registrationMonth);
            form.setAddedDay(registrationDay);
            return form;
        }

    }
}
