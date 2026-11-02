.class public Lcom/jieli/jl_bt_ota/util/UuidUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "0000-1000-8000-00805F9B34FB"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static varargs a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v0, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static equalUUID(Ljava/util/UUID;Ljava/util/UUID;)Z
    .locals 0

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static getDescriptorName(Ljava/util/UUID;)Ljava/lang/String;
    .locals 2
    .param p0    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "0x"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v1, "2905"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x5

    goto :goto_0

    :pswitch_1
    const-string v1, "2904"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x4

    goto :goto_0

    :pswitch_2
    const-string v1, "2903"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x3

    goto :goto_0

    :pswitch_3
    const-string v1, "2902"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x2

    goto :goto_0

    :pswitch_4
    const-string v1, "2901"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x1

    goto :goto_0

    :pswitch_5
    const-string v1, "2900"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_1

    const-string p0, "Unknown Descriptor"

    return-object p0

    :pswitch_6
    const-string p0, "Characteristic Aggregate Format"

    return-object p0

    :pswitch_7
    const-string p0, "Characteristic Presentation Format"

    return-object p0

    :pswitch_8
    const-string p0, "Server Characteristic Configuration"

    return-object p0

    :pswitch_9
    const-string p0, "Client Characteristic Configuration"

    return-object p0

    :pswitch_a
    const-string p0, "Characteristic User Description"

    return-object p0

    :pswitch_b
    const-string p0, "Characteristic Extended Properties"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x179687
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public static getUUIDName(Ljava/util/UUID;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-static {p0}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "0x"

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v2, "2A5C"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v1, 0x33

    goto/16 :goto_0

    :sswitch_1
    const-string v2, "2A5B"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v1, 0x32

    goto/16 :goto_0

    :sswitch_2
    const-string v2, "2A37"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v1, 0x31

    goto/16 :goto_0

    :sswitch_3
    const-string v2, "2A29"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v1, 0x30

    goto/16 :goto_0

    :sswitch_4
    const-string v2, "2A28"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v1, 0x2f

    goto/16 :goto_0

    :sswitch_5
    const-string v2, "2A27"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v1, 0x2e

    goto/16 :goto_0

    :sswitch_6
    const-string v2, "2A26"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v1, 0x2d

    goto/16 :goto_0

    :sswitch_7
    const-string v2, "2A25"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v1, 0x2c

    goto/16 :goto_0

    :sswitch_8
    const-string v2, "2A24"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v1, 0x2b

    goto/16 :goto_0

    :sswitch_9
    const-string v2, "2A23"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v1, 0x2a

    goto/16 :goto_0

    :sswitch_a
    const-string v2, "2A1C"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v1, 0x29

    goto/16 :goto_0

    :sswitch_b
    const-string v2, "2A19"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v1, 0x28

    goto/16 :goto_0

    :sswitch_c
    const-string v2, "2A05"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v1, 0x27

    goto/16 :goto_0

    :sswitch_d
    const-string v2, "2A04"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v1, 0x26

    goto/16 :goto_0

    :sswitch_e
    const-string v2, "2A01"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v1, 0x25

    goto/16 :goto_0

    :sswitch_f
    const-string v2, "2A00"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v1, 0x24

    goto/16 :goto_0

    :sswitch_10
    const-string v2, "1826"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v1, 0x23

    goto/16 :goto_0

    :sswitch_11
    const-string v2, "1820"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v1, 0x22

    goto/16 :goto_0

    :sswitch_12
    const-string v2, "181A"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v1, 0x21

    goto/16 :goto_0

    :sswitch_13
    const-string v2, "1816"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v1, 0x20

    goto/16 :goto_0

    :sswitch_14
    const-string v2, "1814"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v1, 0x1f

    goto/16 :goto_0

    :sswitch_15
    const-string v2, "1812"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v1, 0x1e

    goto/16 :goto_0

    :sswitch_16
    const-string v2, "1811"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v1, 0x1d

    goto/16 :goto_0

    :sswitch_17
    const-string v2, "1810"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v1, 0x1c

    goto/16 :goto_0

    :sswitch_18
    const-string v2, "180F"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v1, 0x1b

    goto/16 :goto_0

    :sswitch_19
    const-string v2, "180D"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v1, 0x1a

    goto/16 :goto_0

    :sswitch_1a
    const-string v2, "180A"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/16 v1, 0x19

    goto/16 :goto_0

    :sswitch_1b
    const-string v2, "1809"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const/16 v1, 0x18

    goto/16 :goto_0

    :sswitch_1c
    const-string v2, "1808"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const/16 v1, 0x17

    goto/16 :goto_0

    :sswitch_1d
    const-string v2, "1801"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/16 v1, 0x16

    goto/16 :goto_0

    :sswitch_1e
    const-string v2, "1800"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const/16 v1, 0x15

    goto/16 :goto_0

    :sswitch_1f
    const-string v2, "1124"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto/16 :goto_0

    :cond_20
    const/16 v1, 0x14

    goto/16 :goto_0

    :sswitch_20
    const-string v2, "111F"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto/16 :goto_0

    :cond_21
    const/16 v1, 0x13

    goto/16 :goto_0

    :sswitch_21
    const-string v2, "111E"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto/16 :goto_0

    :cond_22
    const/16 v1, 0x12

    goto/16 :goto_0

    :sswitch_22
    const-string v2, "1112"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    goto/16 :goto_0

    :cond_23
    const/16 v1, 0x11

    goto/16 :goto_0

    :sswitch_23
    const-string v2, "1111"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    goto/16 :goto_0

    :cond_24
    const/16 v1, 0x10

    goto/16 :goto_0

    :sswitch_24
    const-string v2, "1110"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    goto/16 :goto_0

    :cond_25
    const/16 v1, 0xf

    goto/16 :goto_0

    :sswitch_25
    const-string v2, "110F"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    goto/16 :goto_0

    :cond_26
    const/16 v1, 0xe

    goto/16 :goto_0

    :sswitch_26
    const-string v2, "110E"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_27

    goto/16 :goto_0

    :cond_27
    const/16 v1, 0xd

    goto/16 :goto_0

    :sswitch_27
    const-string v2, "110D"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28

    goto/16 :goto_0

    :cond_28
    const/16 v1, 0xc

    goto/16 :goto_0

    :sswitch_28
    const-string v2, "110C"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_29

    goto/16 :goto_0

    :cond_29
    const/16 v1, 0xb

    goto/16 :goto_0

    :sswitch_29
    const-string v2, "110B"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2a

    goto/16 :goto_0

    :cond_2a
    const/16 v1, 0xa

    goto/16 :goto_0

    :sswitch_2a
    const-string v2, "110A"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2b

    goto/16 :goto_0

    :cond_2b
    const/16 v1, 0x9

    goto/16 :goto_0

    :sswitch_2b
    const-string v2, "1109"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2c

    goto/16 :goto_0

    :cond_2c
    const/16 v1, 0x8

    goto/16 :goto_0

    :sswitch_2c
    const-string v2, "1108"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2d

    goto :goto_0

    :cond_2d
    const/4 v1, 0x7

    goto :goto_0

    :sswitch_2d
    const-string v2, "1107"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2e

    goto :goto_0

    :cond_2e
    const/4 v1, 0x6

    goto :goto_0

    :sswitch_2e
    const-string v2, "1106"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2f

    goto :goto_0

    :cond_2f
    const/4 v1, 0x5

    goto :goto_0

    :sswitch_2f
    const-string v2, "1105"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_30

    goto :goto_0

    :cond_30
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_30
    const-string v2, "1104"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_31

    goto :goto_0

    :cond_31
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_31
    const-string v2, "1103"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_32

    goto :goto_0

    :cond_32
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_32
    const-string v2, "1102"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_33

    goto :goto_0

    :cond_33
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_33
    const-string v2, "1101"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_34

    goto :goto_0

    :cond_34
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown UUID("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    const-string p0, "Running Speed and Cadence Measurement"

    return-object p0

    :pswitch_1
    const-string p0, "Cycling Speed and Cadence Measurement"

    return-object p0

    :pswitch_2
    const-string p0, "Heart Rate Measurement"

    return-object p0

    :pswitch_3
    const-string p0, "Manufacturer Name String"

    return-object p0

    :pswitch_4
    const-string p0, "Software Revision String"

    return-object p0

    :pswitch_5
    const-string p0, "Hardware Revision String"

    return-object p0

    :pswitch_6
    const-string p0, "Firmware Revision String"

    return-object p0

    :pswitch_7
    const-string p0, "Serial Number String"

    return-object p0

    :pswitch_8
    const-string p0, "Model Number String"

    return-object p0

    :pswitch_9
    const-string p0, "System ID"

    return-object p0

    :pswitch_a
    const-string p0, "Temperature Measurement"

    return-object p0

    :pswitch_b
    const-string p0, "Battery Level"

    return-object p0

    :pswitch_c
    const-string p0, "RSSI Characteristic"

    return-object p0

    :pswitch_d
    const-string p0, "Peripheral Preferred Connection Parameters"

    return-object p0

    :pswitch_e
    const-string p0, "Appearance"

    return-object p0

    :pswitch_f
    const-string p0, "Device Name"

    return-object p0

    :pswitch_10
    const-string p0, "Fitness Machine Service"

    return-object p0

    :pswitch_11
    const-string p0, "Internet Protocol Support Service"

    return-object p0

    :pswitch_12
    const-string p0, "Environmental Sensing Service"

    return-object p0

    :pswitch_13
    const-string p0, "Cycling Speed and Cadence Service"

    return-object p0

    :pswitch_14
    const-string p0, "Running Speed and Cadence Service"

    return-object p0

    :pswitch_15
    const-string p0, "Human Interface Device (HID) Service"

    return-object p0

    :pswitch_16
    const-string p0, "Alert Notification Service"

    return-object p0

    :pswitch_17
    const-string p0, "Blood Pressure Service"

    return-object p0

    :pswitch_18
    const-string p0, "Battery Service"

    return-object p0

    :pswitch_19
    const-string p0, "Heart Rate Service"

    return-object p0

    :pswitch_1a
    const-string p0, "Device Information Service"

    return-object p0

    :pswitch_1b
    const-string p0, "Health Thermometer Service"

    return-object p0

    :pswitch_1c
    const-string p0, "Glucose Service"

    return-object p0

    :pswitch_1d
    const-string p0, "Generic Attribute Profile"

    return-object p0

    :pswitch_1e
    const-string p0, "Generic Access Service"

    return-object p0

    :pswitch_1f
    const-string p0, "Human Interface Device Profile(HID)"

    return-object p0

    :pswitch_20
    const-string p0, "Hands-Free Audio Gateway Profile(HFP)"

    return-object p0

    :pswitch_21
    const-string p0, "Heads-Free Profile(HFP)"

    return-object p0

    :pswitch_22
    const-string p0, "Headset Audio Gateway Profile"

    return-object p0

    :pswitch_23
    const-string p0, "Fax Profile"

    return-object p0

    :pswitch_24
    const-string p0, "Intercom Profile"

    return-object p0

    :pswitch_25
    const-string p0, "Video Conferencing Profile"

    return-object p0

    :pswitch_26
    const-string p0, "Audio/Video Remote Control Profile(AVRCP)"

    return-object p0

    :pswitch_27
    const-string p0, "Advanced Audio Distribution Profile"

    return-object p0

    :pswitch_28
    const-string p0, "Audio/Video Remote Control Target Profile"

    return-object p0

    :pswitch_29
    const-string p0, "Advanced Audio Distribution Profile(A2DP)"

    return-object p0

    :pswitch_2a
    const-string p0, "Audio Source Profile"

    return-object p0

    :pswitch_2b
    const-string p0, "Cordless Telephony Profile"

    return-object p0

    :pswitch_2c
    const-string p0, "Headset Profile"

    return-object p0

    :pswitch_2d
    const-string p0, "IrMC Sync Command Profile"

    return-object p0

    :pswitch_2e
    const-string p0, "File Transfer Profile(SPP)"

    return-object p0

    :pswitch_2f
    const-string p0, "Object Push Profile(OPP)"

    return-object p0

    :pswitch_30
    const-string p0, "IrMC Sync Profile"

    return-object p0

    :pswitch_31
    const-string p0, "Dialup Networking Profile"

    return-object p0

    :pswitch_32
    const-string p0, "LAN Access Using PPP Profile"

    return-object p0

    :pswitch_33
    const-string p0, "Serial Port Profile(SPP)"

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x170421 -> :sswitch_33
        0x170422 -> :sswitch_32
        0x170423 -> :sswitch_31
        0x170424 -> :sswitch_30
        0x170425 -> :sswitch_2f
        0x170426 -> :sswitch_2e
        0x170427 -> :sswitch_2d
        0x170428 -> :sswitch_2c
        0x170429 -> :sswitch_2b
        0x170431 -> :sswitch_2a
        0x170432 -> :sswitch_29
        0x170433 -> :sswitch_28
        0x170434 -> :sswitch_27
        0x170435 -> :sswitch_26
        0x170436 -> :sswitch_25
        0x17043f -> :sswitch_24
        0x170440 -> :sswitch_23
        0x170441 -> :sswitch_22
        0x170454 -> :sswitch_21
        0x170455 -> :sswitch_20
        0x170462 -> :sswitch_1f
        0x171e67 -> :sswitch_1e
        0x171e68 -> :sswitch_1d
        0x171e6f -> :sswitch_1c
        0x171e70 -> :sswitch_1b
        0x171e78 -> :sswitch_1a
        0x171e7b -> :sswitch_19
        0x171e7d -> :sswitch_18
        0x171e86 -> :sswitch_17
        0x171e87 -> :sswitch_16
        0x171e88 -> :sswitch_15
        0x171e8a -> :sswitch_14
        0x171e8c -> :sswitch_13
        0x171e97 -> :sswitch_12
        0x171ea5 -> :sswitch_11
        0x171eab -> :sswitch_10
        0x17b48f -> :sswitch_f
        0x17b490 -> :sswitch_e
        0x17b493 -> :sswitch_d
        0x17b494 -> :sswitch_c
        0x17b4b7 -> :sswitch_b
        0x17b4c1 -> :sswitch_a
        0x17b4d0 -> :sswitch_9
        0x17b4d1 -> :sswitch_8
        0x17b4d2 -> :sswitch_7
        0x17b4d3 -> :sswitch_6
        0x17b4d4 -> :sswitch_5
        0x17b4d5 -> :sswitch_4
        0x17b4d6 -> :sswitch_3
        0x17b4f3 -> :sswitch_2
        0x17b53c -> :sswitch_1
        0x17b53d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "-"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    if-eq v1, v2, :cond_1

    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 v1, 0x1

    aget-object v1, v0, v1

    const-string v2, "0000-1000-8000-00805F9B34FB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_3

    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 p0, 0x4

    invoke-virtual {v0, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "0x%s"

    invoke-static {v0, p0}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static read32BitUUID(Ljava/util/UUID;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "-"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    if-eq v1, v2, :cond_1

    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 v1, 0x1

    aget-object v1, v0, v1

    const-string v2, "0000-1000-8000-00805F9B34FB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_3

    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "0x%s"

    invoke-static {v0, p0}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static to128BitUUID(Ljava/lang/String;)Ljava/util/UUID;
    .locals 0

    invoke-static {p0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p0

    return-object p0
.end method

.method public static to16BitUUID(Ljava/lang/String;)Ljava/util/UUID;
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string p0, "0000"

    :cond_1
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "0000%s-0000-1000-8000-00805F9B34FB"

    invoke-static {v0, p0}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p0

    return-object p0
.end method

.method public static to32BitUUID(Ljava/lang/String;)Ljava/util/UUID;
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string p0, "00000000"

    :cond_1
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "%s-0000-1000-8000-00805F9B34FB"

    invoke-static {v0, p0}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p0

    return-object p0
.end method

.method public static toUUID(Ljava/lang/String;)Landroid/os/ParcelUuid;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    new-instance v0, Landroid/os/ParcelUuid;

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->to128BitUUID(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/ParcelUuid;-><init>(Ljava/util/UUID;)V

    return-object v0

    :cond_0
    new-instance v0, Landroid/os/ParcelUuid;

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->to32BitUUID(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/ParcelUuid;-><init>(Ljava/util/UUID;)V

    return-object v0

    :cond_1
    new-instance v0, Landroid/os/ParcelUuid;

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->to16BitUUID(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/ParcelUuid;-><init>(Ljava/util/UUID;)V

    return-object v0
.end method
