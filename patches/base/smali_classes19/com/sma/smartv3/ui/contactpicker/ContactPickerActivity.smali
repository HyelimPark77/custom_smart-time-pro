.class public Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/miguelcatalan/materialsearchview/MaterialSearchView$I0IIOi;


# static fields
.field public static final EXTRA_RESULT_SELECTION:Ljava/lang/String; = "extra_result_selection"


# instance fields
.field private adapter:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

.field private allSelected:Z

.field private animationCloseEnter:Ljava/lang/Integer;

.field private animationCloseExit:Ljava/lang/Integer;

.field private builder:Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

.field private contactList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/contactpicker/Contact;",
            ">;"
        }
    .end annotation
.end field

.field private controlPanel:Landroid/widget/LinearLayout;

.field private loadTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;

.field private progressBar:Landroid/widget/ProgressBar;

.field private progressBarAsnc:Landroid/widget/ProgressBar;

.field private recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

.field private searchMenuItem:Landroid/view/MenuItem;

.field private searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

.field private toolbar:Landroidx/appcompat/widget/Toolbar;

.field private tvNoContacts:Landroid/widget/TextView;

.field private tvSelectAll:Landroid/widget/TextView;

.field private tvSelectBtn:Landroid/widget/TextView;

.field private tvSelectBtnTip:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->contactList:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->allSelected:Z

    return-void
.end method

.method public static bridge synthetic I0iXXO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->allSelected:Z

    return p0
.end method

.method public static bridge synthetic I1XOi1(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->tvNoContacts:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic IIX1OXO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->tvSelectAll:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic O10IXXX0X(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Landroid/widget/ProgressBar;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->progressBar:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method public static bridge synthetic OIX0iXi(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->adapter:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    return-object p0
.end method

.method public static bridge synthetic X0O(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Landroid/widget/ProgressBar;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->progressBarAsnc:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method public static bridge synthetic X1ii(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->contactList:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic XX0(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->updateSelectBarContents(I)V

    return-void
.end method

.method public static bridge synthetic XXI(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->builder:Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    return-object p0
.end method

.method public static bridge synthetic XiOIO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->allSelected:Z

    return-void
.end method

.method private finishPicking()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->adapter:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->getSelectedContacts()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/sma/smartv3/ui/contactpicker/ContactPicker;->buildResult(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v1

    const-string v2, "extra_result_selection"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->overrideAnimation()V

    return-void
.end method

.method public static bridge synthetic iIiiO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->finishPicking()V

    return-void
.end method

.method private initialiseUI(Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "builder"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->toolbar:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    invoke-virtual {v0, p0}, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;->setOnQueryTextListener(Lcom/miguelcatalan/materialsearchview/MaterialSearchView$I0IIOi;)V

    iget-object v0, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->animationCloseEnter:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->animationCloseEnter:Ljava/lang/Integer;

    iget-object v0, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->animationCloseExit:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->animationCloseExit:Ljava/lang/Integer;

    iget v0, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->bubbleColor:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    invoke-virtual {v1, v0}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setBubbleColor(I)V

    :cond_0
    iget v0, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->handleColor:I

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    invoke-virtual {v1, v0}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setHandleColor(I)V

    :cond_1
    iget v0, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->bubbleTextColor:I

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    invoke-virtual {v1, v0}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setBubbleTextColor(I)V

    :cond_2
    iget v0, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->trackColor:I

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    invoke-virtual {v1, v0}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setTrackColor(I)V

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    iget-boolean v1, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->hideScrollbar:Z

    invoke-virtual {v0, v1}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setHideScrollbar(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    iget-boolean v1, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->showTrack:Z

    invoke-virtual {v0, v1}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setTrackVisible(Z)V

    iget v0, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->selectionMode:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->controlPanel:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->controlPanel:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    iget v0, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->selectionMode:I

    if-ne v0, v1, :cond_6

    iget-object v0, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->selectedItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "You must be using ContactPicker.CHOICE_MODE_MULTIPLE in order to use setSelectedContacts()"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_1
    iget-object p1, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->titleText:Ljava/lang/String;

    if-eqz p1, :cond_7

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    :cond_7
    return-void
.end method

.method private loadContacts()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->tvSelectAll:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->builder:Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    iget v0, v0, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->loadingMode:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->progressBarAsnc:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    new-instance v0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;-><init>(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->loadTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void
.end method

.method private overrideAnimation()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->animationCloseEnter:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->animationCloseExit:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->animationCloseExit:Ljava/lang/Integer;

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
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "totalSelectedContacts"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->tvSelectBtn:Landroid/widget/TextView;

    if-lez p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    const v0, 0x7f141324

    const-string v1, ")"

    const v2, 0x7f1410d8

    if-lez p1, :cond_1

    iget-object v3, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->tvSelectBtnTip:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->builder:Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    iget p1, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->maxSelectCount:I

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->tvSelectBtn:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->tvSelectBtnTip:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "(0/"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->builder:Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    iget v2, v2, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->maxSelectCount:I

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->tvSelectBtn:Landroid/widget/TextView;

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

    check-cast p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->builder:Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    iget p1, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->theme:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setTheme(I)V

    return-void
.end method

.method public initView()V
    .locals 4

    const v0, 0x7f0a0bc3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->toolbar:Landroidx/appcompat/widget/Toolbar;

    const v0, 0x7f0a0a01

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    const v0, 0x7f0a0287

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->controlPanel:Landroid/widget/LinearLayout;

    const v0, 0x7f0a0975

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->progressBar:Landroid/widget/ProgressBar;

    const v0, 0x7f0a0976

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->progressBarAsnc:Landroid/widget/ProgressBar;

    const v0, 0x7f0a0c11

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->tvSelectAll:Landroid/widget/TextView;

    const v0, 0x7f0a0c10

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->tvSelectBtn:Landroid/widget/TextView;

    const v0, 0x7f0a0c12

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->tvSelectBtnTip:Landroid/widget/TextView;

    const v0, 0x7f0a0c0a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->tvNoContacts:Landroid/widget/TextView;

    const v0, 0x7f0a0995

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->builder:Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->initialiseUI(Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->builder:Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    iget v0, v0, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->maxSelectCount:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->tvSelectAll:Landroid/widget/TextView;

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
    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->builder:Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    iget-object v2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->contactList:Ljava/util/List;

    new-instance v3, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$1;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$1;-><init>(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;-><init>(Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;Ljava/util/List;Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactSelectListener;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->adapter:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->loadContacts()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->recyclerView:Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->adapter:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-virtual {v0, v1}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->tvSelectBtn:Landroid/widget/TextView;

    new-instance v1, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$2;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$2;-><init>(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->tvSelectAll:Landroid/widget/TextView;

    new-instance v1, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$3;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$3;-><init>(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d004e

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->searchMenuItem:Landroid/view/MenuItem;

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->builder:Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    iget-object v0, v0, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->searchIconColor:Ljava/lang/Integer;

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->setSearchIconColor(Landroid/view/MenuItem;Ljava/lang/Integer;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->searchMenuItem:Landroid/view/MenuItem;

    invoke-virtual {p1, v0}, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;->setMenuItem(Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->loadTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/blankj/utilcode/util/ThreadUtils$Task;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Cancel loadTask"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->loadTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->cancel(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    :cond_0
    return-void
.end method

.method public onHandleBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    invoke-virtual {v0}, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;->XiOIO()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->searchView:Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    invoke-virtual {v0}, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;->XXI()V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->overrideAnimation()V

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->overrideAnimation()V

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->adapter:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->filterOnText(Ljava/lang/String;)V

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->adapter:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->filterOnText(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
