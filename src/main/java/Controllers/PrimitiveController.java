package Controllers;

import model.customLogic.Deal;
import model.customLogic.DealResolver;
import model.customLogic.deck.Cards;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class PrimitiveController extends HttpServlet {

    public static final String ATTRIBUTE_DEAL_TO_VIEW = "unresolvedDeal";
    public static final String ATTRIBUTE_RESULT_TO_VIEW = "resolvedDeal";
    public static final String VIEW_OK = "deal.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StringBuilder unresolvedDeal = new StringBuilder();
        StringBuilder resolvedDeal = new StringBuilder();

        Deal deal = new Deal();
        List<Cards> newDeal = deal.getNewDeal();

        for(Cards card : newDeal){
            unresolvedDeal.append(card.getShortName());
            unresolvedDeal.append(' ');
        }

        DealResolver dealResolver = new DealResolver();

        List<Cards> result = dealResolver.resolveAllMatches(newDeal);

        for(Cards card : result){
            resolvedDeal.append(card.getShortName());
            resolvedDeal.append(' ');
        }


        req.setAttribute(ATTRIBUTE_DEAL_TO_VIEW, unresolvedDeal.toString());
        req.setAttribute(ATTRIBUTE_RESULT_TO_VIEW, resolvedDeal.toString());

        req.getRequestDispatcher(VIEW_OK).forward(req, resp);


    }
}
