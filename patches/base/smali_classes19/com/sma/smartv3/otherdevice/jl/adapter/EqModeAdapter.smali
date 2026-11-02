.class public Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/jieli/jl_rcsp/model/device/EqInfo;",
        ">;"
    }
.end annotation


# instance fields
.field private selectMode:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "list"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/EqInfo;",
            ">;)V"
        }
    .end annotation

    const v0, 0x7f0d0ee2

    invoke-direct {p0, p1, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;->selectMode:I

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/jieli/jl_rcsp/model/device/EqInfo;I)V
    .locals 2
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
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getMode()I

    move-result p3

    invoke-virtual {p0, p3}, Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;->getModeNmae(I)Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a0c78

    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 3
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;->selectMode:I

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getMode()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p3, v0}, Landroid/view/View;->setSelected(Z)V

    const p3, 0x7f0a062b

    .line 4
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 5
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getMode()I

    move-result p3

    const/4 v0, 0x6

    if-ne p3, v0, :cond_1

    .line 6
    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/XIXi00OX;->XIi00iiXO(Lcom/jieli/jl_rcsp/model/device/EqInfo;)Landroid/graphics/Bitmap;

    move-result-object p2

    goto :goto_1

    .line 7
    :cond_1
    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/XIXi00OX;->IO(Lcom/jieli/jl_rcsp/model/device/EqInfo;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p2

    .line 8
    :goto_1
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

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
    check-cast p2, Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/jieli/jl_rcsp/model/device/EqInfo;I)V

    return-void
.end method

.method public getModeNmae(I)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mode"
        }
    .end annotation

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f03001e

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method public select(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "selectMode"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;->selectMode:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method
