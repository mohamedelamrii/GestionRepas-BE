package  ma.enova.repas.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.repas.bean.core.PlanningRepas;
import ma.enova.repas.bean.history.PlanningRepasHistory;
import ma.enova.repas.dao.criteria.core.PlanningRepasCriteria;
import ma.enova.repas.dao.criteria.history.PlanningRepasHistoryCriteria;
import ma.enova.repas.service.facade.admin.PlanningRepasAdminService;
import ma.enova.repas.ws.converter.PlanningRepasConverter;
import ma.enova.repas.ws.dto.PlanningRepasDto;
import ma.enova.repas.zynerator.controller.AbstractController;
import ma.enova.repas.zynerator.dto.AuditEntityDto;
import ma.enova.repas.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.repas.zynerator.process.Result;

@Api("Manages planningRepas services")
@RestController
@RequestMapping("/api/admin/planningRepas/")
public class PlanningRepasRestAdmin  extends AbstractController<PlanningRepas, PlanningRepasDto, PlanningRepasHistory, PlanningRepasCriteria, PlanningRepasHistoryCriteria, PlanningRepasAdminService, PlanningRepasConverter> {

    @ApiOperation("Finds a list of all planningRepass")
    @GetMapping("")
    public ResponseEntity<List<PlanningRepasDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  planningRepas")
    @PutMapping("")
    public ResponseEntity<PlanningRepasDto> update(@RequestBody PlanningRepasDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a planningRepas by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PlanningRepasDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  planningRepas")
    @PostMapping("")
    public ResponseEntity<PlanningRepasDto> save(@RequestBody PlanningRepasDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of planningRepas")
    @DeleteMapping("delete")
    public ResponseEntity<List<PlanningRepasDto>> delete(@RequestBody List<PlanningRepasDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified planningRepas")
    @DeleteMapping("")
    public ResponseEntity<PlanningRepasDto> delete(@RequestBody PlanningRepasDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified planningRepas")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple planningRepass by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by planning id")
    @GetMapping("planning/id/{id}")
    public List<PlanningRepas> findByPlanningId(@PathVariable Long id){
        return service.findByPlanningId(id);
    }
    @ApiOperation("delete by planning id")
    @DeleteMapping("planning/id/{id}")
    public int deleteByPlanningId(@PathVariable Long id){
        return service.deleteByPlanningId(id);
    }
    @ApiOperation("find by repas id")
    @GetMapping("repas/id/{id}")
    public List<PlanningRepas> findByRepasId(@PathVariable Long id){
        return service.findByRepasId(id);
    }
    @ApiOperation("delete by repas id")
    @DeleteMapping("repas/id/{id}")
    public int deleteByRepasId(@PathVariable Long id){
        return service.deleteByRepasId(id);
    }
    @ApiOperation("find by typeRepas id")
    @GetMapping("typeRepas/id/{id}")
    public List<PlanningRepas> findByTypeRepasId(@PathVariable Long id){
        return service.findByTypeRepasId(id);
    }
    @ApiOperation("delete by typeRepas id")
    @DeleteMapping("typeRepas/id/{id}")
    public int deleteByTypeRepasId(@PathVariable Long id){
        return service.deleteByTypeRepasId(id);
    }
    @ApiOperation("Finds planningRepass by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PlanningRepasDto>> findByCriteria(@RequestBody PlanningRepasCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated planningRepass by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PlanningRepasCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports planningRepass by criteria")
    @PostMapping("exportPlanningRepass")
    public ResponseEntity<InputStreamResource> export(@RequestBody PlanningRepasCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets planningRepas data size by criteria")
    @PostMapping("getPlanningRepassDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody PlanningRepasCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets planningRepas history by id")
    @GetMapping("histPlanningRepas/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets planningRepas paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PlanningRepasHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports planningRepas history by criteria")
    @PostMapping("exportPlanningRepassHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PlanningRepasHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets planningRepas history data size by criteria")
    @PostMapping("getHistPlanningRepassDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PlanningRepasHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PlanningRepasRestAdmin (PlanningRepasAdminService service, PlanningRepasConverter converter) {
        super(service, converter);
    }


}
