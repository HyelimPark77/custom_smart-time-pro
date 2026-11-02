.class public final Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method

.method public onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    sget-object p1, Lcom/sma/smartv3/model/LevelType;->STANDARD:Lcom/sma/smartv3/model/LevelType;

    goto :goto_4

    :cond_2
    :goto_1
    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    sget-object p1, Lcom/sma/smartv3/model/LevelType;->LOW:Lcom/sma/smartv3/model/LevelType;

    goto :goto_4

    :cond_4
    :goto_2
    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_6

    sget-object p1, Lcom/sma/smartv3/model/LevelType;->HIGH:Lcom/sma/smartv3/model/LevelType;

    goto :goto_4

    :cond_6
    :goto_3
    sget-object p1, Lcom/sma/smartv3/model/LevelType;->ALL:Lcom/sma/smartv3/model/LevelType;

    :goto_4
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->access$showItems(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;Lcom/sma/smartv3/model/LevelType;)V

    return-void
.end method

.method public onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method
