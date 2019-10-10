/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.repository.bridge.client.management;

import io.gravitee.repository.exceptions.TechnicalException;
import io.gravitee.repository.management.api.GroupRepository;
import io.gravitee.repository.management.model.Group;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Set;

/**
 * @author David BRASSELY (david.brassely at graviteesource.com)
 * @author GraviteeSource Team
 */
@Component
public class HttpGroupRepository extends AbstractRepository implements GroupRepository {

    @Override
    public Optional<Group> findById(String s) throws TechnicalException {
        throw new IllegalStateException();
    }

    @Override
    public Group create(Group item) throws TechnicalException {
        throw new IllegalStateException();
    }

    @Override
    public Group update(Group item) throws TechnicalException {
        throw new IllegalStateException();
    }

    @Override
    public void delete(String s) throws TechnicalException {
        throw new IllegalStateException();
    }

    @Override
    public Set<Group> findAll() throws TechnicalException {
        throw new IllegalStateException();
    }

    @Override
    public Set<Group> findByIds(Set<String> ids) throws TechnicalException {
        throw new IllegalStateException();
    }

    @Override
    public Set<Group> findAllByEnvironment(String environment) throws TechnicalException {
        throw new IllegalStateException();
    }
}
