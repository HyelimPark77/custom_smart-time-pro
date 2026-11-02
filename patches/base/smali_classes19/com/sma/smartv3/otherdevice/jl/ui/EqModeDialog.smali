.class public Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;
.super Landroidx/fragment/app/DialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$XIi00iiXO;
    }
.end annotation


# instance fields
.field private mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

.field private mOnSelectedChange:Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$XIi00iiXO;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/DialogFragment;-><init>()V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    return-void
.end method

.method private getData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/EqInfo;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/XIXi00OX;->OIX0iXi()Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->getEqInfos()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic iO(Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;)Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$XIi00iiXO;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;->mOnSelectedChange:Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$XIi00iiXO;

    return-object p0
.end method

.method public static newInstance(Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$XIi00iiXO;)Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "onSelectedChange"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;

    invoke-direct {v0}, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    iput-object p0, v0, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;->mOnSelectedChange:Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$XIi00iiXO;

    return-object v0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "inflater",
            "container",
            "savedInstanceState"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->requireDialog()Landroid/app/Dialog;

    move-result-object p3

    invoke-virtual {p3}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const/16 v1, 0x50

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    const/4 v1, -0x1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    const/4 v1, 0x0

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->horizontalMargin:F

    invoke-virtual {p3, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_0
    const p3, 0x7f0d02df

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;->getData()Ljava/util/List;

    move-result-object v0

    invoke-direct {p2, p3, v0}, Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/XIXi00OX;->XOO0ii0()Lcom/jieli/jl_rcsp/model/device/EqInfo;

    move-result-object p3

    iput-object p3, p0, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;->mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getMode()I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;->select(I)V

    const p3, 0x7f0a09c7

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    new-instance v0, Lcom/sma/smartv3/otherdevice/jl/view/CommonDecoration;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f06021e

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2, v3}, Lcom/sma/smartv3/otherdevice/jl/view/CommonDecoration;-><init>(Landroid/content/Context;III)V

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    new-instance p3, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$OXO1;

    invoke-direct {p3, p0, p2}, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$OXO1;-><init>(Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;)V

    invoke-virtual {p2, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->setOnItemClickListener(Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$iO;)V

    const p2, 0x7f0a0c77

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    new-instance p3, Lcom/android/mltcode/paycertificationapi/IIXiiO0i;

    invoke-direct {p3, p0}, Lcom/android/mltcode/paycertificationapi/IIXiiO0i;-><init>(Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method public onStart()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onStart()V

    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->requireDialog()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method
