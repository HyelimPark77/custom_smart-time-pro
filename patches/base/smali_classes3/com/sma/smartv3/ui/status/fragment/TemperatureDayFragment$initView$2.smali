.class public final Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment$initView$2;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/db/entity/Temperature;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;Landroid/app/Activity;ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;",
            "Landroid/app/Activity;",
            "I",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/Temperature;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment$initView$2;->this$0:Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;

    invoke-direct {p0, p2, p3, p4}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/db/entity/Temperature;I)V
    .locals 1

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment$initView$2;->this$0:Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;

    invoke-virtual {v0, p1, p2, p3}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/db/entity/Temperature;I)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/db/entity/Temperature;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment$initView$2;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/db/entity/Temperature;I)V

    return-void
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment$initView$2;->this$0:Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->getCount()I

    move-result v0

    return v0
.end method
