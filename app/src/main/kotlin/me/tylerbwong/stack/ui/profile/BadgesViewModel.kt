package me.tylerbwong.stack.ui.profile

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import me.tylerbwong.stack.api.model.Badge
import me.tylerbwong.stack.api.service.UserService
import me.tylerbwong.stack.ui.BaseViewModel

class BadgesViewModel @ViewModelInject constructor(
    private val userService: UserService
) : BaseViewModel() {

    internal val badges: LiveData<List<Badge>>
        get() = _badges
    private val _badges = MutableLiveData<List<Badge>>()

    internal var userId = -1

    internal fun fetchBadges() {
        launchRequest {
            _badges.value = userService.getUserBadges(userId).items
        }
    }
}
