.class public final Lcom/szabh/smable3/entity/BleNaviInfo$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/entity/BleNaviInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleNaviInfo$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final bdTurnIconNameToType(Ljava/lang/String;)I
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "turnIconName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "turn_branch_center.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 p1, 0x7

    return p1

    :sswitch_1
    const-string v0, "turn_back_2branch_left.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    const/4 p1, 0x2

    return p1

    :sswitch_2
    const-string v0, "turn_front.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 p1, 0xd

    return p1

    :sswitch_3
    const-string v0, "turn_left_side_ic.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 p1, 0x18

    return p1

    :sswitch_4
    const-string v0, "turn_right_back.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 p1, 0x24

    return p1

    :sswitch_5
    const-string v0, "turn_back.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_0

    :cond_5
    const/4 p1, 0x1

    return p1

    :sswitch_6
    const-string v0, "turn_rb_2branch_right.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 p1, 0x1d

    return p1

    :sswitch_7
    const-string v0, "turn_lf_2branch_left.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 p1, 0x1a

    return p1

    :sswitch_8
    const-string v0, "turn_rb_3branch_center.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 p1, 0x1e

    return p1

    :sswitch_9
    const-string v0, "turn_back_3branch_left.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_0

    :cond_9
    const/4 p1, 0x5

    return p1

    :sswitch_a
    const-string v0, "turn_back_3branch_center.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto/16 :goto_0

    :cond_a
    const/4 p1, 0x4

    return p1

    :sswitch_b
    const-string v0, "turn_branch_left_straight.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 p1, 0x9

    return p1

    :sswitch_c
    const-string v0, "turn_left.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 p1, 0x14

    return p1

    :sswitch_d
    const-string v0, "turn_lb_2branch_left.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 p1, 0xf

    return p1

    :sswitch_e
    const-string v0, "turn_ring_rightback.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 p1, 0x2f

    return p1

    :sswitch_f
    const-string v0, "turn_lb_3branch_right.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 p1, 0x13

    return p1

    :sswitch_10
    const-string v0, "turn_back_2branch_right.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto/16 :goto_0

    :cond_10
    const/4 p1, 0x3

    return p1

    :sswitch_11
    const-string v0, "turn_rf_2branch_left.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 p1, 0x21

    return p1

    :sswitch_12
    const-string v0, "turn_lb_3branch_left.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 p1, 0x12

    return p1

    :sswitch_13
    const-string v0, "turn_lf_2branch_right.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 p1, 0x1b

    return p1

    :sswitch_14
    const-string v0, "turn_ring_turnback.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 p1, 0x31

    return p1

    :sswitch_15
    const-string v0, "turn_ring_right.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 p1, 0x2e

    return p1

    :sswitch_16
    const-string v0, "turn_dest.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 p1, 0xc

    return p1

    :sswitch_17
    const-string v0, "turn_along.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :sswitch_18
    const-string v0, "turn_rb_2branch_left.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 p1, 0x1c

    return p1

    :sswitch_19
    const-string v0, "turn_right_side_main.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 p1, 0x28

    return p1

    :sswitch_1a
    const-string v0, "turn_ring_rightfront.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 p1, 0x30

    return p1

    :sswitch_1b
    const-string v0, "turn_lb_3branch_center.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 p1, 0x11

    return p1

    :sswitch_1c
    const-string v0, "turn_right.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/16 p1, 0x23

    return p1

    :sswitch_1d
    const-string v0, "turn_branch_right_straight.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const/16 p1, 0xb

    return p1

    :sswitch_1e
    const-string v0, "turn_left_back.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const/16 p1, 0x15

    return p1

    :sswitch_1f
    const-string v0, "turn_rb_3branch_left.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/16 p1, 0x1f

    return p1

    :sswitch_20
    const-string v0, "turn_right_side.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const/16 p1, 0x26

    return p1

    :sswitch_21
    const-string v0, "turn_lb_2branch_right.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_20

    goto/16 :goto_0

    :cond_20
    const/16 p1, 0x10

    return p1

    :sswitch_22
    const-string v0, "turn_ring_left.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_21

    goto/16 :goto_0

    :cond_21
    const/16 p1, 0x2b

    return p1

    :sswitch_23
    const-string v0, "turn_left_front.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_22

    goto/16 :goto_0

    :cond_22
    const/16 p1, 0x16

    return p1

    :sswitch_24
    const-string v0, "turn_right_side_ic.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_23

    goto/16 :goto_0

    :cond_23
    const/16 p1, 0x27

    return p1

    :sswitch_25
    const-string v0, "turn_ring_leftfront.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_24

    goto/16 :goto_0

    :cond_24
    const/16 p1, 0x2d

    return p1

    :sswitch_26
    const-string v0, "turn_branch_left.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_25

    goto/16 :goto_0

    :cond_25
    const/16 p1, 0x8

    return p1

    :sswitch_27
    const-string v0, "turn_right_front.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_26

    goto/16 :goto_0

    :cond_26
    const/16 p1, 0x25

    return p1

    :sswitch_28
    const-string v0, "turn_branch_right.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_27

    goto/16 :goto_0

    :cond_27
    const/16 p1, 0xa

    return p1

    :sswitch_29
    const-string v0, "turn_rb_3branch_right.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_28

    goto :goto_0

    :cond_28
    const/16 p1, 0x20

    return p1

    :sswitch_2a
    const-string v0, "turn_inferry.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_29

    goto :goto_0

    :cond_29
    const/16 p1, 0xe

    return p1

    :sswitch_2b
    const-string v0, "turn_ring_leftback.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2a

    goto :goto_0

    :cond_2a
    const/16 p1, 0x2c

    return p1

    :sswitch_2c
    const-string v0, "turn_ring.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2b

    goto :goto_0

    :cond_2b
    const/16 p1, 0x29

    return p1

    :sswitch_2d
    const-string v0, "turn_left_side_main.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2c

    goto :goto_0

    :cond_2c
    const/16 p1, 0x19

    return p1

    :sswitch_2e
    const-string v0, "turn_rf_2branch_right.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2d

    goto :goto_0

    :cond_2d
    const/16 p1, 0x22

    return p1

    :sswitch_2f
    const-string v0, "turn_left_side.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2e

    goto :goto_0

    :cond_2e
    const/16 p1, 0x17

    return p1

    :sswitch_30
    const-string v0, "turn_ring_front.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2f

    goto :goto_0

    :cond_2f
    const/16 p1, 0x2a

    return p1

    :sswitch_31
    const-string v0, "turn_back_3branch_right.png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_30

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_30
    const/4 p1, 0x6

    return p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e479429 -> :sswitch_31
        -0x79b91669 -> :sswitch_30
        -0x70b02df8 -> :sswitch_2f
        -0x6eaba99d -> :sswitch_2e
        -0x6b42b0da -> :sswitch_2d
        -0x6779a513 -> :sswitch_2c
        -0x62ad4fea -> :sswitch_2b
        -0x5c5d88f2 -> :sswitch_2a
        -0x54ab52a0 -> :sswitch_29
        -0x42fac784 -> :sswitch_28
        -0x3fb8bd41 -> :sswitch_27
        -0x3df1a203 -> :sswitch_26
        -0x38513010 -> :sswitch_25
        -0x345ab9a8 -> :sswitch_24
        -0x2ce80152 -> :sswitch_23
        -0x21f0af51 -> :sswitch_22
        -0x132036db -> :sswitch_21
        -0x5f0b829 -> :sswitch_20
        -0x4b54367 -> :sswitch_1f
        0xc9b198 -> :sswitch_1e
        0x1765ef3 -> :sswitch_1d
        0xb6ab215 -> :sswitch_1c
        0xe467721 -> :sswitch_1b
        0xf3b6575 -> :sswitch_1a
        0x119a22b7 -> :sswitch_19
        0x19b8deba -> :sswitch_18
        0x1b3a95d6 -> :sswitch_17
        0x1fdc665f -> :sswitch_16
        0x21229c0a -> :sswitch_15
        0x2301ba8c -> :sswitch_14
        0x23895029 -> :sswitch_13
        0x294c7213 -> :sswitch_12
        0x2c006736 -> :sswitch_11
        0x310e8dd6 -> :sswitch_10
        0x3d89a726 -> :sswitch_f
        0x44cad5f1 -> :sswitch_e
        0x47ba9434 -> :sswitch_d
        0x48b6cd44 -> :sswitch_c
        0x4ce8da92 -> :sswitch_b
        0x4ff04890 -> :sswitch_a
        0x54c9d342 -> :sswitch_9
        0x59dc3827 -> :sswitch_8
        0x5a021cb0 -> :sswitch_7
        0x5aaacf5f -> :sswitch_6
        0x60b4c224 -> :sswitch_5
        0x6b892767 -> :sswitch_4
        0x6d36c287 -> :sswitch_3
        0x708effa2 -> :sswitch_2
        0x7337f563 -> :sswitch_1
        0x7e3d108b -> :sswitch_0
    .end sparse-switch
.end method
