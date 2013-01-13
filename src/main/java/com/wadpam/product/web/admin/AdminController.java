/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.product.web.admin;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sosandstrom
 */
@Controller
@RequestMapping("{domain}/_admin")
public class AdminController {

    @RequestMapping(value="deleteAllProductEntities")
    public ResponseEntity deleteAllProductEntities() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
