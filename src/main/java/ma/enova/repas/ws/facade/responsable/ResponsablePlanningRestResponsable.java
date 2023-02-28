package  ma.enova.repas.ws.facade.responsable;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.repas.bean.core.ResponsablePlanning;
import ma.enova.repas.bean.history.ResponsablePlanningHistory;
import ma.enova.repas.dao.criteria.core.ResponsablePlanningCriteria;
import ma.enova.repas.dao.criteria.history.ResponsablePlanningHistoryCriteria;
import ma.enova.repas.service.facade.responsable.ResponsablePlanningResponsableService;
import ma.enova.repas.ws.converter.ResponsablePlanningConverter;
import ma.enova.repas.ws.dto.ResponsablePlanningDto;
import ma.enova.repas.zynerator.controller.AbstractController;
import ma.enova.repas.zynerator.dto.AuditEntityDto;
import ma.enova.repas.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.repas.zynerator.process.Result;

@Api("Manages responsablePlanning services")
@RestController
@RequestMapping("/api/responsable/responsablePlanning/")
public class ResponsablePlanningRestResponsable  extends AbstractController<ResponsablePlanning, ResponsablePlanningDto, ResponsablePlanningHistory, ResponsablePlanningCriteria, ResponsablePlanningHistoryCriteria, ResponsablePlanningResponsableService, ResponsablePlanningConverter> {

    @ApiOperation("Finds a list of all responsablePlannings")
    @GetMapping("")
    public ResponseEntity<List<ResponsablePlanningDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  responsablePlanning")
    @PutMapping("")
    public ResponseEntity<ResponsablePlanningDto> update(@RequestBody ResponsablePlanningDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a responsablePlanning by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ResponsablePlanningDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  responsablePlanning")
    @PostMapping("")
    public ResponseEntity<ResponsablePlanningDto> save(@RequestBody ResponsablePlanningDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of responsablePlanning")
    @DeleteMapping("delete")
    public ResponseEntity<List<ResponsablePlanningDto>> delete(@RequestBody List<ResponsablePlanningDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified responsablePlanning")
    @DeleteMapping("")
    public ResponseEntity<ResponsablePlanningDto> delete(@RequestBody ResponsablePlanningDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified responsablePlanning")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple responsablePlannings by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds responsablePlannings by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ResponsablePlanningDto>> findByCriteria(@RequestBody ResponsablePlanningCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated responsablePlannings by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ResponsablePlanningCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports responsablePlannings by criteria")
    @PostMapping("exportResponsablePlannings")
    public ResponseEntity<InputStreamResource> export(@RequestBody ResponsablePlanningCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets responsablePlanning data size by criteria")
    @PostMapping("getResponsablePlanningsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody ResponsablePlanningCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets responsablePlanning history by id")
    @GetMapping("histResponsablePlanning/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets responsablePlanning paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ResponsablePlanningHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports responsablePlanning history by criteria")
    @PostMapping("exportResponsablePlanningsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ResponsablePlanningHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets responsablePlanning history data size by criteria")
    @PostMapping("getHistResponsablePlanningsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ResponsablePlanningHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ResponsablePlanningRestResponsable (ResponsablePlanningResponsableService service, ResponsablePlanningConverter converter) {
        super(service, converter);
    }


}
