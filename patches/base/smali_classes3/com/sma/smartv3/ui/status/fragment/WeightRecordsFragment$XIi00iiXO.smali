.class public final Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/uf1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/github/mikephil/charting/data/Entry;Lcom/android/mltcode/paycertificationapi/X110O;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "h"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;

    invoke-static {p2}, Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;->access$getMActivity(Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;)Landroid/app/Activity;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Activity;->isFinishing()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;->updateItemData(Lcom/github/mikephil/charting/data/Entry;)V

    :cond_0
    return-void
.end method

.method public XIi00iiXO()V
    .locals 0

    return-void
.end method
