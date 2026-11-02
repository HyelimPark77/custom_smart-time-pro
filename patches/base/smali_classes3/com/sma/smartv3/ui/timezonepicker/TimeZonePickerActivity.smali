.class public Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/miguelcatalan/materialsearchview/MaterialSearchView$I0IIOi;


# static fields
.field private static final DEBUG:Z = false

.field public static final EXTRA_RESULT_SELECTION:Ljava/lang/String; = "extra_result_selection"

.field private static final TAG:Ljava/lang/String; = "TimeZonePickerActivity"


# instance fields
.field private adapter:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

.field private allSelected:Z

.field private animationCloseEnter:Ljava/lang/Integer;

.field private animationCloseExit:Ljava/lang/Integer;

.field private builder:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

.field private controlPanel:Landroid/widget/LinearLayout;

.field private loadTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;

.field private mTimeZones:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;",
            ">;"
        }
    .end annotation
.end field

.field private progressBar:Landroid/widget/ProgressBar;

.field private progressBarAsnc:Landroid/widget/ProgressBar;

.field private recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

.field private searchMenuItem:Landroid/view/MenuItem;

.field private searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

.field private toolbar:Landroidx/appcompat/widget/Toolbar;

.field private tvNoData:Landroid/widget/TextView;

.field private tvSelectAll:Landroid/widget/TextView;

.field private tvSelectBtn:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->mTimeZones:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->allSelected:Z

    return-void
.end method

.method public static bridge synthetic I0iXXO(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->allSelected:Z

    return p0
.end method

.method public static bridge synthetic I1XOi1(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Lcom/l4digital/fastscroll/FastScrollRecyclerView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    return-object p0
.end method

.method public static bridge synthetic IIX1OXO(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->tvNoData:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic O10IXXX0X(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Landroid/widget/ProgressBar;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->progressBar:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method public static bridge synthetic OIX0iXi(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Lcom/sma/smartv3/ui/timezonepicker/OXO1;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->adapter:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    return-object p0
.end method

.method public static bridge synthetic OiIIX101O(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->loadTzsInZoneTab(Landroid/content/Context;)V

    return-void
.end method

.method public static bridge synthetic X0O(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Landroid/widget/ProgressBar;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->progressBarAsnc:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method public static bridge synthetic X1ii(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->mTimeZones:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic XX0(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->finishPicking(Ljava/util/List;)V

    return-void
.end method

.method public static bridge synthetic XXI(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->builder:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    return-object p0
.end method

.method public static bridge synthetic XiOIO(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->tvSelectAll:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic XiOIii1(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->updateSelectBarContents(I)V

    return-void
.end method

.method private finishPicking(Ljava/util/List;)V
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
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "extra_result_selection"

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker;->OXO1(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const/4 p1, -0x1

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->overrideAnimation()V

    return-void
.end method

.method private getCountryNames(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "lang",
            "countryCode"
        }
    .end annotation

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    new-instance v1, Ljava/util/Locale;

    invoke-direct {v1, p1, p2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/util/Locale;->getDisplayCountry(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    return-object p2
.end method

.method private getIdenticalTimeZoneInTheCountry(Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;)I
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "timeZoneInfo"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->mTimeZones:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;

    invoke-virtual {v2, p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->hasSameRules(Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getCountry()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getCountry()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getCountry()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_1
    return v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public static bridge synthetic iIiiO(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->allSelected:Z

    return-void
.end method

.method private initialiseUI(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "builder"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->toolbar:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    invoke-virtual {v0, p0}, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;->setOnQueryTextListener(Lcom/miguelcatalan/materialsearchview/MaterialSearchView$I0IIOi;)V

    iget-object v0, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->animationCloseEnter:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->animationCloseEnter:Ljava/lang/Integer;

    iget-object v0, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->animationCloseExit:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->animationCloseExit:Ljava/lang/Integer;

    iget v0, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->bubbleColor:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    invoke-virtual {v1, v0}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setBubbleColor(I)V

    :cond_0
    iget v0, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->handleColor:I

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    invoke-virtual {v1, v0}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setHandleColor(I)V

    :cond_1
    iget v0, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->bubbleTextColor:I

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    invoke-virtual {v1, v0}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setBubbleTextColor(I)V

    :cond_2
    iget v0, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->trackColor:I

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    invoke-virtual {v1, v0}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setTrackColor(I)V

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    iget-boolean v1, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->hideScrollbar:Z

    invoke-virtual {v0, v1}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setHideScrollbar(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    iget-boolean v1, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->showTrack:Z

    invoke-virtual {v0, v1}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setTrackVisible(Z)V

    iget v0, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->selectionMode:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->controlPanel:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->controlPanel:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    iget-object p1, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->titleText:Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    :cond_5
    return-void
.end method

.method private loadData()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->tvSelectAll:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->builder:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    iget v0, v0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->loadingMode:I

    const/4 v2, 0x4

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->progressBarAsnc:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    invoke-virtual {v0, v2}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    invoke-virtual {v0, v2}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setVisibility(I)V

    :goto_0
    new-instance v0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->loadTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void
.end method

.method private loadTzsInZoneTab(Landroid/content/Context;)V
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    const-string v0, "TimeZonePickerActivity"

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    const-string v4, "zone.tab"

    invoke-virtual {v1, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    new-instance v1, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    const-string v5, "#"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "\t"

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    aget-object v5, v4, v5

    const/4 v6, 0x0

    aget-object v4, v4, v6

    invoke-static {v5}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v6

    if-nez v6, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Timezone not found: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    if-nez v4, :cond_2

    const-string v7, "Etc/GMT"

    invoke-virtual {v5, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0, v3, v4}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->getCountryNames(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;

    invoke-direct {v5, p1, v6, v4}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;-><init>(Landroid/content/Context;Ljava/util/TimeZone;Ljava/lang/String;)V

    invoke-direct {p0, v5}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->getIdenticalTimeZoneInTheCountry(Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;)I

    move-result v4

    const/4 v6, -0x1

    if-ne v4, v6, :cond_0

    iget-object v4, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->mTimeZones:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->builder:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    iget-object v4, v4, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->selectedItems:Ljava/util/ArrayList;

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getCityName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->adapter:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getCityName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->X1ii(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    new-instance v1, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;

    const-string v3, "America/Los_Angeles"

    invoke-static {v3}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v3

    const v4, 0x7f140df8

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, p1, v3, v5}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;-><init>(Landroid/content/Context;Ljava/util/TimeZone;Ljava/lang/String;)V

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->setCityName(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->mTimeZones:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_4

    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_0
    :try_start_2
    const-string p1, "Failed to read \'zone.tab\'."

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v2, :cond_4

    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :cond_4
    return-void

    :goto_1
    if-eqz v2, :cond_5

    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    :cond_5
    throw p1
.end method

.method private overrideAnimation()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->animationCloseEnter:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->animationCloseExit:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->animationCloseExit:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    :cond_0
    return-void
.end method

.method private setSearchIconColor(Landroid/view/MenuItem;Ljava/lang/Integer;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x10
        }
        names = {
            "menuItem",
            "color"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-interface {p1}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/core/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p2}, Landroidx/core/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    :cond_0
    return-void
.end method

.method private updateSelectBarContents(I)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "totalSelectedTimeZones"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->tvSelectBtn:Landroid/widget/TextView;

    if-lez p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    if-lez p1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->builder:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    iget v0, v0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->maxSelectCount:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->tvSelectBtn:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const v1, 0x7f141325

    invoke-virtual {p0, v1, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->tvSelectBtn:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->builder:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    iget v1, v1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->maxSelectCount:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object p1

    const v1, 0x7f141326

    invoke-virtual {p0, v1, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->tvSelectBtn:Landroid/widget/TextView;

    const v0, 0x7f141324

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "savedInstanceState"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "builder"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->builder:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    iget p1, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->theme:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setTheme(I)V

    return-void
.end method

.method public initView()V
    .locals 4

    const v0, 0x7f0a0bc3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->toolbar:Landroidx/appcompat/widget/Toolbar;

    const v0, 0x7f0a0a01

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    const v0, 0x7f0a0287

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->controlPanel:Landroid/widget/LinearLayout;

    const v0, 0x7f0a0975

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->progressBar:Landroid/widget/ProgressBar;

    const v0, 0x7f0a0976

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->progressBarAsnc:Landroid/widget/ProgressBar;

    const v0, 0x7f0a0c11

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->tvSelectAll:Landroid/widget/TextView;

    const v0, 0x7f0a0c10

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->tvSelectBtn:Landroid/widget/TextView;

    const v0, 0x7f0a0c0b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->tvNoData:Landroid/widget/TextView;

    const v0, 0x7f0a0995

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->builder:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->initialiseUI(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->builder:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    iget v0, v0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->maxSelectCount:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->tvSelectAll:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v0, Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->builder:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    iget-object v2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->mTimeZones:Ljava/util/ArrayList;

    new-instance v3, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$OXO1;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;-><init>(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;Ljava/util/List;Lcom/sma/smartv3/ui/timezonepicker/OXO1$iO;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->adapter:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->loadData()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->adapter:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    invoke-virtual {v0, v1}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->tvSelectBtn:Landroid/widget/TextView;

    new-instance v1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->tvSelectAll:Landroid/widget/TextView;

    new-instance v1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$iO;-><init>(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d012d

    return v0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "menu"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f0003

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const v0, 0x7f0a0826

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->searchMenuItem:Landroid/view/MenuItem;

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->builder:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    iget-object v0, v0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->searchIconColor:Ljava/lang/Integer;

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->setSearchIconColor(Landroid/view/MenuItem;Ljava/lang/Integer;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->searchMenuItem:Landroid/view/MenuItem;

    invoke-virtual {p1, v0}, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;->setMenuItem(Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->loadTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/blankj/utilcode/util/ThreadUtils$Task;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Cancel loadTask"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->loadTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->cancel(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    :cond_0
    return-void
.end method

.method public onHandleBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    invoke-virtual {v0}, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;->XiOIO()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    invoke-virtual {v0}, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;->XXI()V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->overrideAnimation()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "item"
        }
    .end annotation

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->overrideAnimation()V

    :goto_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "newText"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->adapter:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->filterOnText(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "query"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->adapter:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->filterOnText(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
