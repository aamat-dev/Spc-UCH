package fr.aamat.components.planning.viewmodel;

import fr.aamat.ApplicationComponent;
import fr.aamat.ApplicationContext;
import fr.aamat.components.planning.view.MainPlanningView;

public class PlanningComponent implements ApplicationComponent {
    @Override
    public void initComponent(ApplicationContext context) {
        PlanningState planningState = context.getStateRegistry().getState(PlanningState.class);

        PlanningViewModel planningViewModel = new PlanningViewModel();
        planningState.getPlanningCellSize().listen(planningViewModel.getCurrentCellSize()::set);

        MainPlanningView mainPlanningView = new MainPlanningView(planningViewModel);
        context.getMainView().setCenterContent(mainPlanningView);
    }

    @Override
    public void initState(ApplicationContext context) {
        PlanningState planningState = new PlanningState();
        context.getStateRegistry().registerState(PlanningState.class, planningState);
    }
}
