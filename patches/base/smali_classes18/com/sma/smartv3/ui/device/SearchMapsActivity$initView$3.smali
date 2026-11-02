.class public final Lcom/sma/smartv3/ui/device/SearchMapsActivity$initView$3;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/SearchMapsActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/SearchDistrict;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/device/SearchMapsActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/SearchMapsActivity;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/SearchDistrict;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity$initView$3;->this$0:Lcom/sma/smartv3/ui/device/SearchMapsActivity;

    const v0, 0x7f0d0f0f

    invoke-direct {p0, p1, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/model/SearchDistrict;Lcom/sma/smartv3/ui/device/SearchMapsActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/SearchMapsActivity$initView$3;->convert$lambda$0(Lcom/sma/smartv3/model/SearchDistrict;Lcom/sma/smartv3/ui/device/SearchMapsActivity;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lcom/sma/smartv3/model/SearchDistrict;Lcom/sma/smartv3/ui/device/SearchMapsActivity;Landroid/view/View;)V
    .locals 3

    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SearchDistrict;->getLatitude()D

    move-result-wide v0

    const-string v2, "MAP_POINT_LAT"

    invoke-virtual {p2, v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    const-string v0, "MAP_POINT_LON"

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SearchDistrict;->getLongitude()D

    move-result-wide v1

    invoke-virtual {p2, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    const/4 p0, -0x1

    invoke-virtual {p1, p0, p2}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/SearchDistrict;I)V
    .locals 1

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/sma/smartv3/model/SearchDistrict;->getName()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a08b5

    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    const p3, 0x7f0a08b1

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/model/SearchDistrict;->getDistrict()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p3, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 4
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object p3, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity$initView$3;->this$0:Lcom/sma/smartv3/ui/device/SearchMapsActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/by3;

    invoke-direct {v0, p2, p3}, Lcom/android/mltcode/paycertificationapi/by3;-><init>(Lcom/sma/smartv3/model/SearchDistrict;Lcom/sma/smartv3/ui/device/SearchMapsActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/SearchDistrict;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/SearchMapsActivity$initView$3;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/SearchDistrict;I)V

    return-void
.end method
