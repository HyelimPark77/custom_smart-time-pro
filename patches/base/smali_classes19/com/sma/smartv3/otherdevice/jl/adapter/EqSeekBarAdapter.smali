.class public final Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/android/mltcode/paycertificationapi/OXXXOX;",
        ">;"
    }
.end annotation


# instance fields
.field private ban:Z

.field private mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

.field private mHasHoverView:Z

.field private mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private mValueChange:Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter$OXO1;

.field private selectMode:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter$OXO1;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "list",
            "valueChange"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/OXXXOX;",
            ">;",
            "Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter$OXO1;",
            ")V"
        }
    .end annotation

    const v0, 0x7f0d0ee3

    invoke-direct {p0, p1, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const/4 p1, -0x1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->selectMode:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->mHasHoverView:Z

    new-instance p1, Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    iput-object p3, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->mValueChange:Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter$OXO1;

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->mHasHoverView:Z

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;ILcom/android/mltcode/paycertificationapi/OXXXOX;IZ)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-gez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2, p3}, Lcom/android/mltcode/paycertificationapi/OXXXOX;->IiI10X(I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getValue()[B

    move-result-object p1

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/OXXXOX;->XIi00iiXO()I

    move-result p3

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/OXXXOX;->iO()I

    move-result v0

    int-to-byte v0, v0

    aput-byte v0, p1, p3

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->mValueChange:Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter$OXO1;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/OXXXOX;->XIi00iiXO()I

    move-result p2

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-interface {p1, p2, p0, p4}, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter$OXO1;->OXO1(ILcom/jieli/jl_rcsp/model/device/EqInfo;Z)V

    return-void
.end method

.method public static freqValueToFreqShowText(I)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value"
        }
    .end annotation

    div-int/lit16 v0, p0, 0x3e8

    if-lez v0, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "K"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ""

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getScreenWidth(Landroid/content/Context;)I
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    const-string v0, "window"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowManager;

    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget p0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    return p0
.end method

.method private setNewInstance(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "list"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/OXXXOX;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mDatas:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mDatas:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/android/mltcode/paycertificationapi/OXXXOX;I)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "holder",
            "item",
            "position"
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    const v0, 0x7f0a0246

    .line 3
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 5
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x7

    if-ge v2, v3, :cond_1

    .line 6
    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    if-eqz v2, :cond_0

    .line 7
    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    div-int/2addr v2, v3

    goto :goto_0

    .line 8
    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenWidth()I

    move-result v2

    const/high16 v3, 0x42700000    # 60.0f

    invoke-static {v3}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    div-int/2addr v2, v3

    goto :goto_0

    :cond_1
    const/high16 v2, 0x42480000    # 50.0f

    .line 9
    invoke-static {v2}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 10
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    const v0, 0x7f0a190e

    .line 12
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;

    .line 13
    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/OXXXOX;->OXO1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->setText(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/OXXXOX;->iO()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->setValue(I)V

    .line 15
    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/OXXXOX;->XIi00iiXO()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->setIndex(I)V

    .line 16
    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->ban:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->setEnable(Z)V

    .line 17
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getValue()[B

    move-result-object v0

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/OXXXOX;->XIi00iiXO()I

    move-result v1

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/OXXXOX;->iO()I

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 18
    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0X10O;

    invoke-direct {v0, p0, p3, p2}, Lcom/android/mltcode/paycertificationapi/O0X10O;-><init>(Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;ILcom/android/mltcode/paycertificationapi/OXXXOX;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->setValueListener(Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$XIi00iiXO;)V

    .line 19
    new-instance p2, Lcom/android/mltcode/paycertificationapi/X00X01i0;

    invoke-direct {p2, p0}, Lcom/android/mltcode/paycertificationapi/X00X01i0;-><init>(Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;)V

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->setHoverListener(Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$OXO1;)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000,
            0x1000
        }
        names = {
            "holder",
            "item",
            "position"
        }
    .end annotation

    .line 1
    check-cast p2, Lcom/android/mltcode/paycertificationapi/OXXXOX;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/android/mltcode/paycertificationapi/OXXXOX;I)V

    return-void
.end method

.method public getValues()[I
    .locals 4

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/android/mltcode/paycertificationapi/OXXXOX;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/OXXXOX;->iO()I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public hasHoverView()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->mHasHoverView:Z

    return v0
.end method

.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "recyclerView"
        }
    .end annotation

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public reset()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/OXXXOX;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/OXXXOX;->IiI10X(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public select(I)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "selectMode"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->selectMode:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setBan(Z)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ban"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->ban:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public updateSeekBar(Lcom/jieli/jl_rcsp/model/device/EqInfo;)V
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "eqInfo"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getValue()[B

    move-result-object v2

    array-length v2, v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getFreqs()[I

    move-result-object v2

    array-length v2, v2

    if-ge v1, v2, :cond_0

    .line 4
    new-instance v2, Lcom/android/mltcode/paycertificationapi/OXXXOX;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getFreqs()[I

    move-result-object v3

    aget v3, v3, v1

    invoke-static {v3}, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->freqValueToFreqShowText(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getValue()[B

    move-result-object v4

    aget-byte v4, v4, v1

    invoke-direct {v2, v1, v3, v4}, Lcom/android/mltcode/paycertificationapi/OXXXOX;-><init>(ILjava/lang/String;I)V

    .line 5
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0, v0}, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->setNewInstance(Ljava/util/List;)V

    return-void
.end method

.method public updateSeekBar([I)V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value"
        }
    .end annotation

    .line 7
    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->mHasHoverView:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    move v4, v1

    move v3, v2

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-ge v2, v5, :cond_2

    array-length v5, p1

    if-ge v2, v5, :cond_2

    .line 10
    aget v5, p1, v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/android/mltcode/paycertificationapi/OXXXOX;

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/OXXXOX;->iO()I

    move-result v6

    if-eq v5, v6, :cond_1

    add-int/lit8 v3, v3, 0x1

    move v4, v2

    .line 11
    :cond_1
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/mltcode/paycertificationapi/OXXXOX;

    aget v6, p1, v2

    invoke-virtual {v5, v6}, Lcom/android/mltcode/paycertificationapi/OXXXOX;->IiI10X(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    if-le v3, p1, :cond_3

    .line 12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void

    :cond_3
    if-eq v4, v1, :cond_4

    .line 13
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    :cond_4
    :goto_1
    return-void
.end method
