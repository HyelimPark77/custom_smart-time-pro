.class public Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field protected transient acc:Landroid/app/Activity;

.field protected animationCloseEnter:Ljava/lang/Integer;

.field protected animationCloseExit:Ljava/lang/Integer;

.field protected animationOpenEnter:Ljava/lang/Integer;

.field protected animationOpenExit:Ljava/lang/Integer;

.field protected bubbleColor:I

.field protected bubbleTextColor:I

.field protected transient frag:Landroidx/fragment/app/Fragment;

.field protected handleColor:I

.field protected hideScrollbar:Z

.field protected loadingMode:I

.field protected maxSelectCount:I

.field protected searchIconColor:Ljava/lang/Integer;

.field protected selectedItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected selectionMode:I

.field protected showTrack:Z

.field protected theme:I
    .annotation build Landroidx/annotation/StyleRes;
    .end annotation
.end field

.field protected titleText:Ljava/lang/String;

.field protected trackColor:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "act"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f150132

    .line 2
    iput v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->theme:I

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->showTrack:Z

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->selectionMode:I

    .line 5
    iput v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->loadingMode:I

    .line 6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->selectedItems:Ljava/util/ArrayList;

    .line 7
    iput v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->maxSelectCount:I

    .line 8
    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->acc:Landroid/app/Activity;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;)V
    .locals 2
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "frag"
        }
    .end annotation

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f150132

    .line 10
    iput v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->theme:I

    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->showTrack:Z

    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->selectionMode:I

    .line 13
    iput v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->loadingMode:I

    .line 14
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->selectedItems:Ljava/util/ArrayList;

    .line 15
    iput v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->maxSelectCount:I

    .line 16
    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->frag:Landroidx/fragment/app/Fragment;

    return-void
.end method


# virtual methods
.method public bubbleColor(I)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "bubbleColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->bubbleColor:I

    return-object p0
.end method

.method public bubbleTextColor(I)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "textColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->bubbleTextColor:I

    return-object p0
.end method

.method public handleColor(I)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "handleColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->handleColor:I

    return-object p0
.end method

.method public hideScrollbar(Z)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "hideScrollbar"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->hideScrollbar:Z

    return-object p0
.end method

.method public searchIconColor(Ljava/lang/Integer;)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "searchIconColor"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->searchIconColor:Ljava/lang/Integer;

    return-object p0
.end method

.method public setActivityAnimations(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Landroidx/annotation/AnimRes;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Integer;
        .annotation build Landroidx/annotation/AnimRes;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation build Landroidx/annotation/AnimRes;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation build Landroidx/annotation/AnimRes;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "animationOpenEnter",
            "animationOpenExit",
            "animationCloseEnter",
            "animationCloseExit"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->animationOpenEnter:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->animationOpenExit:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->animationCloseEnter:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->animationCloseExit:Ljava/lang/Integer;

    return-object p0
.end method

.method public setChoiceMode(I)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "selectionMode"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->selectionMode:I

    return-object p0
.end method

.method public setLoadingType(I)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "loadingMode"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->loadingMode:I

    return-object p0
.end method

.method public setMaxSelectCount(I)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "maxSelectCount"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->maxSelectCount:I

    return-object p0
.end method

.method public setSelected(Ljava/util/ArrayList;)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "selectedTimeZones"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;",
            ">;)",
            "Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->selectedItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 5
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;

    .line 6
    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->selectedItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getTimeZoneId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public setSelected(Ljava/util/List;)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "selectedTimeZoneIds"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->selectedItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 3
    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->selectedItems:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public setTitleText(Ljava/lang/String;)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "titleText"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->titleText:Ljava/lang/String;

    return-object p0
.end method

.method public showPickerForResult(I)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "requestCode"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->acc:Landroid/app/Activity;

    const-string v1, "builder"

    const-class v2, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    iget-object v3, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->acc:Landroid/app/Activity;

    invoke-direct {v0, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->acc:Landroid/app/Activity;

    invoke-virtual {v1, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->animationOpenEnter:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->animationOpenExit:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->acc:Landroid/app/Activity;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->animationOpenExit:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->frag:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    iget-object v3, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->frag:Landroidx/fragment/app/Fragment;

    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v3

    invoke-direct {v0, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->frag:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v0, p1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->animationOpenEnter:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->animationOpenExit:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->frag:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->animationOpenEnter:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->animationOpenExit:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Unable to find a context for intent. Is there a valid activity or fragment passed in the builder?"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public showTrack(Z)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "showTrack"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->showTrack:Z

    return-object p0
.end method

.method public theme(I)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/StyleRes;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "theme"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->theme:I

    return-object p0
.end method

.method public trackColor(I)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "trackColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->trackColor:I

    return-object p0
.end method
