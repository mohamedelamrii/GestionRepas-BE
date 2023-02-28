package  ma.enova.repas.ws.facade.responsable;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.repas.bean.core.TypeRepas;
import ma.enova.repas.bean.history.TypeRepasHistory;
import ma.enova.repas.dao.criteria.core.TypeRepasCriteria;
import ma.enova.repas.dao.criteria.history.TypeRepasHistoryCriteria;
import ma.enova.repas.service.facade.responsable.TypeRepasResponsableService;
import ma.enova.repas.ws.converter.TypeRepasConverter;
import ma.enova.repas.ws.dto.TypeRepasDto;
import ma.enova.repas.zynerator.controller.AbstractController;
import ma.enova.repas.zynerator.dto.AuditEntityDto;
import ma.enova.repas.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.repas.zynerator.process.Result;

@Api("Manages typeRepas services")
@RestController
@RequestMapping("/api/responsable/typeRepas/")
public class TypeRepasRestResponsable  extends AbstractController<TypeRepas, TypeRepasDto, TypeRepasHistory, TypeRepasCriteria, TypeRepasHistoryCriteria, TypeRepasResponsableService, TypeRepasConverter> {

    @ApiOperation("Finds a list of all typeRepass")
    @GetMapping("")
    public ResponseEntity<List<TypeRepasDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  typeRepas")
    @PutMapping("")
    public ResponseEntity<TypeRepasDto> update(@RequestBody TypeRepasDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a typeRepas by id")
    @GetMapping("{id}")
    public ResponseEntity<TypeRepasDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeRepas")
    @PostMapping("")
    public ResponseEntity<TypeRepasDto> save(@RequestBody TypeRepasDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of typeRepas")
    @DeleteMapping("delete")
    public ResponseEntity<List<TypeRepasDto>> delete(@RequestBody List<TypeRepasDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeRepas")
    @DeleteMapping("")
    public ResponseEntity<TypeRepasDto> delete(@RequestBody TypeRepasDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified typeRepas")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple typeRepass by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds typeRepass by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TypeRepasDto>> findByCriteria(@RequestBody TypeRepasCriteria criteria) throws Exception {
            return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeRepass by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeRepasCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeRepass by criteria")
    @PostMapping("exportTypeRepass")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeRepasCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeRepas data size by criteria")
    @PostMapping("getTypeRepassDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeRepasCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeRepas history by id")
    @GetMapping("histTypeRepas/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeRepas paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeRepasHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeRepas history by criteria")
    @PostMapping("exportTypeRepassHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeRepasHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeRepas history data size by criteria")
    @PostMapping("getHistTypeRepassDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeRepasHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TypeRepasRestResponsable (TypeRepasResponsableService service, TypeRepasConverter converter) {
        super(service, converter);
    }


}
