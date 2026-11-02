.class public final Lcom/sma/smartv3/pop/dial/DialPointerPopup$4;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/pop/dial/DialPointerPopup;-><init>(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;Lcom/android/mltcode/paycertificationapi/IO0I100XX;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/ResourcesIdInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $callback:Lcom/android/mltcode/paycertificationapi/IO0I100XX;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/IO0I100XX<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Lcom/android/mltcode/paycertificationapi/IO0I100XX;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;",
            "Lcom/android/mltcode/paycertificationapi/IO0I100XX<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p3, p0, Lcom/sma/smartv3/pop/dial/DialPointerPopup$4;->$callback:Lcom/android/mltcode/paycertificationapi/IO0I100XX;

    const p3, 0x7f0d0efe

    invoke-direct {p0, p1, p3, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/pop/dial/DialPointerPopup$4;Lcom/sma/smartv3/model/ResourcesIdInfo;Lcom/android/mltcode/paycertificationapi/IO0I100XX;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/pop/dial/DialPointerPopup$4;->convert$lambda$0(Lcom/sma/smartv3/pop/dial/DialPointerPopup$4;Lcom/sma/smartv3/model/ResourcesIdInfo;Lcom/android/mltcode/paycertificationapi/IO0I100XX;ILandroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lcom/sma/smartv3/pop/dial/DialPointerPopup$4;Lcom/sma/smartv3/model/ResourcesIdInfo;Lcom/android/mltcode/paycertificationapi/IO0I100XX;ILandroid/view/View;)V
    .locals 2

    iget-object p4, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mDatas:Ljava/util/List;

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/model/ResourcesIdInfo;->setSelect(Z)V

    goto :goto_0

    :cond_0
    const/4 p4, 0x1

    invoke-virtual {p1, p4}, Lcom/sma/smartv3/model/ResourcesIdInfo;->setSelect(Z)V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/android/mltcode/paycertificationapi/IO0I100XX;->XIi00iiXO(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/ResourcesIdInfo;I)V
    .locals 2

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resourcesIdInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0939

    .line 2
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/model/ResourcesIdInfo;->getResId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    const v0, 0x7f0a0a12

    .line 4
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 5
    invoke-virtual {p2}, Lcom/sma/smartv3/model/ResourcesIdInfo;->isSelect()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 6
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const v0, 0x7f0a09c1

    .line 7
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/sma/smartv3/pop/dial/DialPointerPopup$4;->$callback:Lcom/android/mltcode/paycertificationapi/IO0I100XX;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OX1XiiIi;

    invoke-direct {v1, p0, p2, v0, p3}, Lcom/android/mltcode/paycertificationapi/OX1XiiIi;-><init>(Lcom/sma/smartv3/pop/dial/DialPointerPopup$4;Lcom/sma/smartv3/model/ResourcesIdInfo;Lcom/android/mltcode/paycertificationapi/IO0I100XX;I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/pop/dial/DialPointerPopup$4;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/ResourcesIdInfo;I)V

    return-void
.end method
