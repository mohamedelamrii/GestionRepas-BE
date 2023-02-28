package  ma.enova.repas.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.repas.bean.core.PlanningExecution;
import ma.enova.repas.bean.history.PlanningExecutionHistory;
import ma.enova.repas.dao.criteria.core.PlanningExecutionCriteria;
import ma.enova.repas.dao.criteria.history.PlanningExecutionHistoryCriteria;
import ma.enova.repas.service.facade.admin.PlanningExecutionAdminService;
import ma.enova.repas.ws.converter.PlanningExecutionConverter;
import ma.enova.repas.ws.dto.PlanningExecutionDto;
import ma.enova.repas.zynerator.controller.AbstractController;
import ma.enova.repas.zynerator.dto.AuditEntityDto;
import ma.enova.repas.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.repas.zynerator.process.Result;
import ma.enova.repas.workflow.admin.process.planningexecution.save.PlanningExecutionSaveAdminProcess ;
import ma.enova.repas.workflow.admin.process.planningexecution.save.PlanningExecutionSaveAdminInput ;
import ma.enova.repas.workflow.admin.process.planningexecution.save.PlanningExecutionSaveAdminOutput ;

@Api("Manages planningExecution services")
@RestController
@RequestMapping("/api/admin/planningExecution/")
public class PlanningExecutionRestAdmin  extends AbstractController<PlanningExecution, PlanningExecutionDto, PlanningExecutionHistory, PlanningExecutionCriteria, PlanningExecutionHistoryCriteria, PlanningExecutionAdminService, PlanningExecutionConverter> {

    @ApiOperation("save a planningExecution")
    @PostMapping("process/save")
    public ResponseEntity<Result<PlanningExecutionSaveAdminInput,PlanningExecutionSaveAdminOutput, PlanningExecution>> saveProcess(@RequestBody PlanningExecutionSaveAdminInput input) throws Exception {
        Result<PlanningExecutionSaveAdminInput, PlanningExecutionSaveAdminOutput, PlanningExecution> result = planningExecutionSaveAdminProcess.execute(input);
        return new ResponseEntity<>(result, result.getStatus());
    }
    @ApiOperation("Finds a list of all planningExecutions")
    @GetMapping("")
    public ResponseEntity<List<PlanningExecutionDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  planningExecution")
    @PutMapping("")
    public ResponseEntity<PlanningExecutionDto> update(@RequestBody PlanningExecutionDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a planningExecution by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PlanningExecutionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  planningExecution")
    @PostMapping("")
    public ResponseEntity<PlanningExecutionDto> save(@RequestBody PlanningExecutionDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of planningExecution")
    @DeleteMapping("delete")
    public ResponseEntity<List<PlanningExecutionDto>> delete(@RequestBody List<PlanningExecutionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified planningExecution")
    @DeleteMapping("")
    public ResponseEntity<PlanningExecutionDto> delete(@RequestBody PlanningExecutionDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified planningExecution")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple planningExecutions by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by planningRepas id")
    @GetMapping("planningRepas/id/{id}")
    public List<PlanningExecution> findByPlanningRepasId(@PathVariable Long id){
        return service.findByPlanningRepasId(id);
    }
    @ApiOperation("delete by planningRepas id")
    @DeleteMapping("planningRepas/id/{id}")
    public int deleteByPlanningRepasId(@PathVariable Long id){
        return service.deleteByPlanningRepasId(id);
    }
    @ApiOperation("Finds planningExecutions by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PlanningExecutionDto>> findByCriteria(@RequestBody PlanningExecutionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated planningExecutions by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PlanningExecutionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports planningExecutions by criteria")
    @PostMapping("exportPlanningExecutions")
    public ResponseEntity<InputStreamResource> export(@RequestBody PlanningExecutionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets planningExecution data size by criteria")
    @PostMapping("getPlanningExecutionsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody PlanningExecutionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets planningExecution history by id")
    @GetMapping("histPlanningExecution/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets planningExecution paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PlanningExecutionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports planningExecution history by criteria")
    @PostMapping("exportPlanningExecutionsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PlanningExecutionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets planningExecution history data size by criteria")
    @PostMapping("getHistPlanningExecutionsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PlanningExecutionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PlanningExecutionRestAdmin (PlanningExecutionAdminService service, PlanningExecutionConverter converter) {
        super(service, converter);
    }

    @Autowired
    private PlanningExecutionSaveAdminProcess planningExecutionSaveAdminProcess;

}
