.class public Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/miguelcatalan/materialsearchview/MaterialSearchView$I0IIOi;


# static fields
.field public static final EXTRA_RESULT_SELECTION:Ljava/lang/String; = "extra_result_selection"


# instance fields
.field private adapter:Lcom/sma/smartv3/ui/musicpicker/OXO1;

.field private allSelected:Z

.field private animationCloseEnter:Ljava/lang/Integer;

.field private animationCloseExit:Ljava/lang/Integer;

.field private builder:Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

.field private controlPanel:Landroid/widget/LinearLayout;

.field private loadTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;

.field private musicList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/fw0;",
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

.field private tvNoMusics:Landroid/widget/TextView;

.field private tvSelectAll:Landroid/widget/TextView;

.field private tvSelectBtn:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->musicList:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->allSelected:Z

    return-void
.end method

.method public static bridge synthetic I0iXXO(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->allSelected:Z

    return p0
.end method

.method public static bridge synthetic I1XOi1(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->tvNoMusics:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic IIX1OXO(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->tvSelectAll:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic O10IXXX0X(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Landroid/widget/ProgressBar;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->progressBar:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method public static bridge synthetic OIX0iXi(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Lcom/sma/smartv3/ui/musicpicker/OXO1;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->adapter:Lcom/sma/smartv3/ui/musicpicker/OXO1;

    return-object p0
.end method

.method public static bridge synthetic X0O(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Landroid/widget/ProgressBar;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->progressBarAsnc:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method public static bridge synthetic X1ii(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->musicList:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic XX0(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->updateSelectBarContents(I)V

    return-void
.end method

.method public static bridge synthetic XXI(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->builder:Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    return-object p0
.end method

.method public static bridge synthetic XiOIO(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->allSelected:Z

    return-void
.end method

.method private finishPicking()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->adapter:Lcom/sma/smartv3/ui/musicpicker/OXO1;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->OIX0iXi()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/sma/smartv3/ui/musicpicker/MusicPicker;->OXO1(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v1

    const-string v2, "extra_result_selection"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->overrideAnimation()V

    return-void
.end method

.method public static bridge synthetic iIiiO(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->finishPicking()V

    return-void
.end method

.method private initialiseUI(Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "builder"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->toolbar:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    invoke-virtual {v0, p0}, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;->setOnQueryTextListener(Lcom/miguelcatalan/materialsearchview/MaterialSearchView$I0IIOi;)V

    iget-object v0, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->animationCloseEnter:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->animationCloseEnter:Ljava/lang/Integer;

    iget-object v0, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->animationCloseExit:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->animationCloseExit:Ljava/lang/Integer;

    iget v0, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->bubbleColor:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    invoke-virtual {v1, v0}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setBubbleColor(I)V

    :cond_0
    iget v0, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->handleColor:I

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    invoke-virtual {v1, v0}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setHandleColor(I)V

    :cond_1
    iget v0, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->bubbleTextColor:I

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    invoke-virtual {v1, v0}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setBubbleTextColor(I)V

    :cond_2
    iget v0, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->trackColor:I

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    invoke-virtual {v1, v0}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setTrackColor(I)V

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    iget-boolean v1, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->hideScrollbar:Z

    invoke-virtual {v0, v1}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setHideScrollbar(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    iget-boolean v1, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->showTrack:Z

    invoke-virtual {v0, v1}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setTrackVisible(Z)V

    iget v0, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->selectionMode:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->controlPanel:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->controlPanel:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    iget v0, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->selectionMode:I

    if-ne v0, v1, :cond_6

    iget-object v0, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->selectedItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "You must be using MusicPicker.CHOICE_MODE_MULTIPLE in order to use setSelectedMusics()"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_1
    iget-object p1, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->titleText:Ljava/lang/String;

    if-eqz p1, :cond_7

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    :cond_7
    return-void
.end method

.method private loadMusics()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->tvSelectAll:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->builder:Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    iget v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->loadingMode:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->progressBarAsnc:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    new-instance v0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->loadTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void
.end method

.method private overrideAnimation()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->animationCloseEnter:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->animationCloseExit:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->animationCloseExit:Ljava/lang/Integer;

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
            "totalSelectedMusics"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->tvSelectBtn:Landroid/widget/TextView;

    if-lez p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    if-lez p1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->builder:Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    iget v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->maxSelectCount:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->tvSelectBtn:Landroid/widget/TextView;

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
    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->tvSelectBtn:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->builder:Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    iget v1, v1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->maxSelectCount:I

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
    iget-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->tvSelectBtn:Landroid/widget/TextView;

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

    check-cast p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->builder:Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    iget p1, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->theme:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setTheme(I)V

    return-void
.end method

.method public initView()V
    .locals 4

    const v0, 0x7f0a0bc3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->toolbar:Landroidx/appcompat/widget/Toolbar;

    const v0, 0x7f0a0a01

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    const v0, 0x7f0a0287

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->controlPanel:Landroid/widget/LinearLayout;

    const v0, 0x7f0a0975

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->progressBar:Landroid/widget/ProgressBar;

    const v0, 0x7f0a0976

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->progressBarAsnc:Landroid/widget/ProgressBar;

    const v0, 0x7f0a0c11

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->tvSelectAll:Landroid/widget/TextView;

    const v0, 0x7f0a0c10

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->tvSelectBtn:Landroid/widget/TextView;

    const v0, 0x7f0a0c0c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->tvNoMusics:Landroid/widget/TextView;

    const v0, 0x7f0a0995

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->builder:Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->initialiseUI(Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->builder:Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    iget v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->maxSelectCount:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->tvSelectAll:Landroid/widget/TextView;

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
    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v0, Lcom/sma/smartv3/ui/musicpicker/OXO1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->builder:Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    iget-object v2, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->musicList:Ljava/util/List;

    new-instance v3, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$OXO1;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/sma/smartv3/ui/musicpicker/OXO1;-><init>(Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;Ljava/util/List;Lcom/sma/smartv3/ui/musicpicker/OXO1$iO;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->adapter:Lcom/sma/smartv3/ui/musicpicker/OXO1;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->loadMusics()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    iget-object v1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->adapter:Lcom/sma/smartv3/ui/musicpicker/OXO1;

    invoke-virtual {v0, v1}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->tvSelectBtn:Landroid/widget/TextView;

    new-instance v1, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->tvSelectAll:Landroid/widget/TextView;

    new-instance v1, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$iO;-><init>(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00cf

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->searchMenuItem:Landroid/view/MenuItem;

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->builder:Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    iget-object v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->searchIconColor:Ljava/lang/Integer;

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->setSearchIconColor(Landroid/view/MenuItem;Ljava/lang/Integer;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->searchMenuItem:Landroid/view/MenuItem;

    invoke-virtual {p1, v0}, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;->setMenuItem(Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->loadTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/blankj/utilcode/util/ThreadUtils$Task;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Cancel loadTask"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->loadTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->cancel(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    :cond_0
    return-void
.end method

.method public onHandleBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    invoke-virtual {v0}, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;->XiOIO()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    invoke-virtual {v0}, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;->XXI()V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->overrideAnimation()V

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->overrideAnimation()V

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->adapter:Lcom/sma/smartv3/ui/musicpicker/OXO1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->filterOnText(Ljava/lang/String;)V

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->adapter:Lcom/sma/smartv3/ui/musicpicker/OXO1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->filterOnText(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
